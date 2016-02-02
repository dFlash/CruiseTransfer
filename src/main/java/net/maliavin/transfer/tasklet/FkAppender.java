package net.maliavin.transfer.tasklet;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import net.maliavin.transfer.config.FkConstraint;
import net.maliavin.transfer.dbmanager.SchemaManager;

@Component("fkAppender")
public class FkAppender implements Tasklet
{

    Logger log = Logger.getLogger(FkAppender.class);
    @Autowired
    private List<FkConstraint> constraints;
    
    @Autowired
    @Qualifier("postgresSchemaManager")
    private SchemaManager schemaManager;
    
    public RepeatStatus execute(StepContribution arg0, ChunkContext arg1)
            throws Exception
    {
        for (FkConstraint fkConstraint : constraints)
        {
            schemaManager.addFkConstraint(fkConstraint);
        }
        return RepeatStatus.FINISHED;
    }

}
