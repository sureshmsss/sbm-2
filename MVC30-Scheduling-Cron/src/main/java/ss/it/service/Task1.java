package ss.it.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task1 {
	/*
	//to execute for every  minute and 15 second
	@Scheduled(cron = " 15 * * * * *")
	public void doTask() {
		System.out.println("task  : " + new Date());
	}
	//to execute for every day at 18 th hour and  0 minute and 0 second
	@Scheduled(cron = " 0 0 18 * * *")
	public void doTask() {
		System.out.println("task  : " + new Date());
	}
	
	
	// to execute for every day at 18 th hour and 7 minute and 1 second
	@Scheduled(cron = " 1 7 18 * * *")
	public void doTask() {
		System.out.println("task  : " + new Date());
	}
	// to execute for numbered minutes and 15 second
			@Scheduled(cron = " 15 13,14,15 18 * * *")
			public void doTask() {
				System.out.println("task  : " + new Date());
			}
	// to execute the task for 20 second gap
	@Scheduled(cron = " 0/20 * * * * *")
	public void doTask() {
		System.out.println("task  : " + new Date());
	}
	// to execute the task having 15 min gap at 10 sec
	@Scheduled(cron = " 10 0/15 * * * *")
	public void doTask() {
		System.out.println("task  : " + new Date());
	}*/
	// to execute the task having 15 min gap at 10 sec
	@Scheduled(cron = " 10 0/2 23 * * *")
	public void doTask() {
		System.out.println("task  : " + new Date());
	}

}
