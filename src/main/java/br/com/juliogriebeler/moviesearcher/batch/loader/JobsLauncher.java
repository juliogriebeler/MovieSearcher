package br.com.juliogriebeler.moviesearcher.batch.loader;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
@Component
public class JobsLauncher {

 	@Autowired
	private JobLauncher jobLauncher;

 	@Autowired
	private JobBuilderFactory jobBuilderFactory;

 	@Autowired
 	private Step createStep;
 
 	public JobsLauncher() {
 		
 	}
//    public JobsLauncher(final JobLauncher jobLauncher, final JobBuilderFactory jobBuilderFactory, final Step createStep) {
//        this.jobLauncher = jobLauncher;
//        this.jobBuilderFactory = jobBuilderFactory;
//        this.createStep = createStep;
//    }
// 
    private Job databaseToElasticsearchJob() {
        return jobBuilderFactory.get("databaseToElasticsearch")
                .incrementer(new RunIdIncrementer())
                .flow(createStep)
                .end()
                .build();
    }
 
    public void launch() {
        try {
            JobParameters jobParameters = new JobParametersBuilder()
                    .addLong("time", System.currentTimeMillis())
                    .toJobParameters();
            jobLauncher.run(databaseToElasticsearchJob(), jobParameters);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}