package net.maliavin.transfer.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import net.maliavin.transfer.domain.CompanyCategory;

@Repository("companyCategoryDao")
public class CompanyCategoryDAOImpl implements CompanyCategoryDAO
{

    private JdbcTemplate jdbcTemplate;

    public void add(CompanyCategory companyCategory)
    {
        final String name = companyCategory.getName();
        String sql = "INSERT INTO company_category (name) VALUES (?)";

        jdbcTemplate.update(sql, new PreparedStatementSetter()
        {

            public void setValues(PreparedStatement ps) throws SQLException
            {
                ps.setString(1, name);

            }

        });
    }

    public boolean isMappingPresent(Long companyCategoryRuId)
    {
        String sql = "SELECT count(*) "
                + "FROM mapping.company_category_mapping " + "WHERE ru_id = ?";

        boolean result = false;

        int count = jdbcTemplate.queryForObject(sql,
                new Object[] { companyCategoryRuId }, Integer.class);

        if (count > 0)
        {
            result = true;
        }

        return result;
    }

    public boolean isEntityPresent(CompanyCategory companyCategory)
    {
        String sql = "SELECT count(*) " + "FROM company_category "
                + "WHERE name = ?";

        boolean result = false;

        int count = jdbcTemplate.queryForObject(sql,
                new Object[] { companyCategory.getName() }, Integer.class);

        if (count > 0)
        {
            result = true;
        }

        return result;
    }

    public Long getEntityId(CompanyCategory companyCategory)
    {
        String sql = "SELECT company_category_id " + "FROM company_category "
                + "WHERE name = ?";

        Long companyCategoryId = jdbcTemplate.queryForObject(sql,
                new Object[] { companyCategory.getName() }, Long.class);

        return companyCategoryId;
    }

    public void addMapping(Long uaId, Long ruId)
    {
        String sql = "INSERT INTO mapping.company_category_mapping (ru_id, ua_id) "
                + "   VALUES (?, ?)";

        jdbcTemplate.update(sql, new Object[] { ruId, uaId },
                new int[] { Types.BIGINT, Types.BIGINT });
    }

    @Autowired
    @Qualifier("dataSourceUa")
    public void setDataSource(DataSource dataSource)
    {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

}
