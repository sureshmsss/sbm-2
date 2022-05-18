package ss.it.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component("jmsListener")
public class JobMonitoringListener implements JobExecutionListener {
	private long startTime, endTime;

	public JobMonitoringListener() {
		System.out.println("JobMonitoringListener.JobMonitoringListener()");
	}

	@Override
	public void beforeJob(JobExecution jobExecution) {
		System.out.println("JobMonitoringListener.beforeJob()");
		startTime = System.currentTimeMillis();
		System.out.println("Job status : " + jobExecution.getStatus());
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("JobMonitoringListener.afterJob()");
		endTime = System.currentTimeMillis();
		System.out.println("Job status : " + jobExecution.getStatus());
		System.out.println("job execution time : " + (endTime - startTime));
		System.out.println("job exit status : " + jobExecution.getExitStatus());
	}
}
