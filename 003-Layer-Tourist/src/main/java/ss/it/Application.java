package ss.it;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ss.it.model.Tourist;
import ss.it.controller.TPController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
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
				System.out.println(t);
				System.out.println("===============");
				System.out.println(list);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
