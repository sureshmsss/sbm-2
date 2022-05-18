package ss.it.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ss.it.listener.JobMonitoringListener;
import ss.it.processor.BookDetailsProcessor;
import ss.it.reader.BookDetailsReader;
import ss.it.writer.BookDetailsWriter;

@Configuration
@EnableBatchProcessing // gives
//Spring batch features through auto configuration like giving inmemoryjobRepositriry,
//job builder factory, stepBuilder factory and etc
public class BatchConfig {
	@Autowired
	public JobBuilderFactory jobfactory;
	@Autowired
	public StepBuilderFactory stepFactory;

	@Bean
	public BookDetailsProcessor createProcessor() {
		return new BookDetailsProcessor();
	}

	@Bean
	public BookDetailsReader createReader() {
		return new BookDetailsReader();
	}

	@Bean
	public BookDetailsWriter createWriter() {
		return new BookDetailsWriter();
	}

	@Bean
	public JobMonitoringListener createListener() {
		return new JobMonitoringListener();
	}

	// create step object using stepBuilderFactory
	@Bean(name = "step1")
	public Step createStep1() {
		System.out.println("BatchConfig.createStep1()");
		return stepFactory.get("step1").<String, String>chunk(2).reader(createReader()).writer(createWriter())
				.processor(createProcessor()).build();
	}

	// create job using job builder factory
	@Bean(name = "job1")
	public Job createJob() {
		System.out.println("BatchConfig.createJob()");
		return jobfactory.get("job1").incrementer(new RunIdIncrementer()).listener(createListener())
				.start(createStep1()).build();
	}

}
