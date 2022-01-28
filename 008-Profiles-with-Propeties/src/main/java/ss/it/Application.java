package ss.it;

import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import ss.it.controller.TPController;
import ss.it.model.Tourist;

@SpringBootApplication
public class Application {
	/*
	 * @Bean
	 * 
	 * @Profile("dev") public DataSource createADbcp() throws Exception {
	 * ComboPooledDataSource hkds = new ComboPooledDataSource();
	 * hkds.setDriverClass("oracle.jdbc.driver.OracleDriver");
	 * hkds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:suri");
	 * hkds.setUser("system"); hkds.setPassword("manager"); return hkds; }
	 */
	public static void main(String[] args) {
		/*
		 SpringApplication application = new SpringApplication(Application.class);
		 application.setAdditionalProfiles("dev");
		  
		  ApplicationContext ctx = application.run(args);
		 */
		// create IOC container
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		// get the spring bean object
		TPController c = ctx.getBean(TPController.class);

		// invoke the b.method
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the state");
		String s1 = sc.next();

		try {
			List<Tourist> list = c.getTourists_by_location(s1);
			System.out.println("==================");
			for (Tourist t : list) {
				/*
				 * System.out.println(t); System.out.println("===============");
				 */ System.out.println(list);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
