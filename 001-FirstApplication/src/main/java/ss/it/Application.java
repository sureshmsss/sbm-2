package ss.it;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import ss.it.beans.WishMsg;

@SpringBootApplication
public class Application {
	@Bean
	public Calendar getCalendar() {
		return Calendar.getInstance();
	}

	public static void main(String[] args) {
		System.out.println("main() started");
		// create IOC container
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		// get target class object
		WishMsg w = ctx.getBean("wmg", WishMsg.class);

		// call the business method
		System.out.println(w.getMsg("suresh="));

		// close the container
		((ConfigurableApplicationContext) ctx).close();
	}

}
