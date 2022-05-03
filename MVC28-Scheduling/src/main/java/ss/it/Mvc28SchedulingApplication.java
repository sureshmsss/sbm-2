package ss.it;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Mvc28SchedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(Mvc28SchedulingApplication.class, args);
		System.out.println("App started at : " + new Date());
	}

}
