package ss.it.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Task1 {
	/*
	 	// in this method both initial delay and fixed delay both are different 	
	 @Scheduled(initialDelay = 10000, fixedDelay = 3000)
	public void doTask1() {
		System.out.println("task 1 : " + new Date());
	}
	// in this method both initial delay and fixed delay both are 3 seconds 
	@Scheduled(fixedDelay = 3000)
	public void doTask2() {
		System.out.println("task 2 : " + new Date());
	}*/
	// in this method both initial delay and fixed delay both are 3 seconds
	@Scheduled(fixedDelayString = "3000")
	public void doTask3() {
		System.out.println("task 3 : " + new Date());
	}
}
