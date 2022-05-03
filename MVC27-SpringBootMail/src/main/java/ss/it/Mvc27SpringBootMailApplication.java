package ss.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import ss.it.service.OrderService;

@SpringBootApplication
public class Mvc27SpringBootMailApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Mvc27SpringBootMailApplication.class, args);
		//get service class object ref
		OrderService service=ctx.getBean("orderImpl",OrderService.class);
		
		//invoke method
		try {
			String msg=service.purchase(new String[] {"shirt","pant","watch"}, new double[] {5000,6000,7000}, new String[] {
					"suresh.maheshuni94@gmail.com","sureshmaheshuni04@gmail.com"});
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}

}
