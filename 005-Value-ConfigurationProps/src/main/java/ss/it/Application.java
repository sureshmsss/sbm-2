package ss.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import ss.it.beans.Customer;
import ss.it.beans.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		// get spring bean object
		Customer c = ctx.getBean("sss",Customer.class);
		Employee e=ctx.getBean(Employee.class);


		System.out.println("Customer object : " + c);
		System.out.println("employee object : " + e);

		// claose the continer object
		((ConfigurableApplicationContext) ctx).close();
	}

}
