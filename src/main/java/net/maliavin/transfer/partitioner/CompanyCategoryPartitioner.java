package net.maliavin.transfer.partitioner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import net.maliavin.transfer.util.RangeUtil;
import net.maliavin.transfer.util.RangeUtil.Range;

@Component("companyCategoryPartitioner")
public class CompanyCategoryPartitioner implements Partitioner
{
    private static Logger log = Logger
            .getLogger(CompanyCategoryPartitioner.class);

    private JdbcTemplate jdbcTemplate;

    public Map<String, ExecutionContext> partition(int gridSize)
    {
        log.debug("START: Partition for CompanyCategory");

        Map<String, ExecutionContext> partitionMap = new HashMap<String, ExecutionContext>();
        List<Range> ranges = RangeUtil.calculateRanges(gridSize, getIds());

        int threadIndex = 1;
        for (Range range : ranges)
        {
            ExecutionContext ctxMap = new ExecutionContext();
            ctxMap.putLong("startingIndex", range.getStartIndex());
            ctxMap.putLong("endingIndex", range.getEndIndex());

            partitionMap.put("Thread:-" + (threadIndex++), ctxMap);

        }

        log.debug("END: Partition for CompanyCategory ");

        return partitionMap;
    }

    private List<Long> getIds()
    {
        List<Long> ids = jdbcTemplate.queryForList(
                "select company_category_id from company_category", Long.class);
        return ids;
    }

    @Autowired
    @Qualifier("dataSourceRu")
    public void setDataSource(DataSource dataSource)
    {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

}
