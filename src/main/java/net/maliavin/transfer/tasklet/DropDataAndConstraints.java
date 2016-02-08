package net.maliavin.transfer.tasklet;

import java.util.List;
import java.util.Set;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.SetFactoryBean;
import org.springframework.stereotype.Component;

import net.maliavin.transfer.config.FkConstraint;
import net.maliavin.transfer.dbmanager.SchemaManager;

@Component("cleaner")
public class DropDataAndConstraints implements Tasklet
{

    @Autowired
    private List<FkConstraint> constraints;

    @Autowired
    @Qualifier("tables")
    private SetFactoryBean setFactory;

    @Autowired
    @Qualifier("postgresSchemaManager")
    private SchemaManager schemaManager;

    @SuppressWarnings("unchecked")
    public RepeatStatus execute(StepContribution arg0, ChunkContext arg1)
            throws Exception
    {
        for (FkConstraint fkConstraint : constraints)
        {
            schemaManager.dropFkConstraint(fkConstraint);
        }

        Set<String> tables = setFactory.getObject();

        for (String table : tables)
        {
            schemaManager.dropData(table);
        }

        return RepeatStatus.FINISHED;
    }

}
