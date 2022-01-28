package ss.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import ss.it.beans.OracleSQL;

@SpringBootApplication//(exclude = DataSourceAutoConfiguration.class)
public class Application {
/*
	@Bean
	public DataSource createDs() throws Exception {

		ComboPooledDataSource ds = new ComboPooledDataSource();
		ds.setDriverClass("oracle.jdbc.driver.OracleDriver");
		ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:suri");
		ds.setUser("system");
		ds.setPassword("manager");
		return ds;
	}
*/
	public static void main(String[] args) {
		// create IOC container
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		// get the spring bean object
		OracleSQL o = ctx.getBean(OracleSQL.class);

		// invoke b.method
		try {
			System.out.println("========");
			System.out.println(o.getrows());
			System.out.println("========");
			System.out.println(o.getCount());
			System.out.println("========");
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}

		// close the container
		((ConfigurableApplicationContext) ctx).close();
	}

}
