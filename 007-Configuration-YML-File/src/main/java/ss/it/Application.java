package ss.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import ss.it.model.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// create IOC container
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		//get SpringBean class obj
		Employee emp=ctx.getBean("emp",Employee.class);
		System.out.println(emp);
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}

}
