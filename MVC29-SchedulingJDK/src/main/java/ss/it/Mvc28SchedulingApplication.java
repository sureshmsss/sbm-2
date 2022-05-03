package ss.it;

import java.util.Date;
import java.util.Timer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import ss.it.service.Task1;

@SpringBootApplication
@EnableScheduling
public class Mvc28SchedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(Mvc28SchedulingApplication.class, args);
		System.out.println("App started at : " + new Date());
		Timer timer = new Timer();
		// timer.schedule(new Task1(), 5000,3000);//period of time execution
		// timer.schedule(new Task1(), 5000);
		timer.schedule(new Task1(), new Date(122, 04, 03, 17, 04));
	}
}
