package net.maliavin.transfer.main;

import org.apache.log4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main
{

    private static Logger logger = Logger.getLogger(Main.class);
    private static final String[] springConfig = { "launchContext.xml",
            "dbContext.xml", "jobContext.xml" };
    private static ApplicationContext context;

    public static void main(String[] args)
    {
        logger.info("Transfer started");
        context = new FileSystemXmlApplicationContext(
                springConfig);
        
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("mainJob");
        
        try
        {
            jobLauncher.run(job, new JobParameters());
        }
        catch (JobExecutionAlreadyRunningException e)
        {
            logger.error(e.toString());
            e.printStackTrace();
        }
        catch (JobRestartException e)
        {
            logger.error(e.toString());
            e.printStackTrace();
        }
        catch (JobInstanceAlreadyCompleteException e)
        {
            logger.error(e.toString());
            e.printStackTrace();
        }
        catch (JobParametersInvalidException e)
        {
            logger.error(e.toString());
            e.printStackTrace();
        }
        
        logger.info("Transfer finished");

    }

}
