package ss.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import ss.it.beans.Voter;

@SpringBootApplication 
//@ComponentScan(basePackages="ss.it.beans")
public class Application {

	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		//create spring bean object
		Voter v=ctx.getBean(Voter.class);
		
		
		System.out.println("Voter object is : "+v);
		
		//close the container
		((ConfigurableApplicationContext) ctx).close();
	}

}
