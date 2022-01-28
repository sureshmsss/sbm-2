package ss.it;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ss.it.cont.CoronaController;
import ss.it.model.Patient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// create IOC container
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		// get the spring bean object
		CoronaController c = ctx.getBean(CoronaController.class);

		// invoke the b.method
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the city1");
		String s1 = sc.next();
		System.out.println("enter the city2");
		String s2 = sc.next();

		try {
			List<Patient> list = c.show_patient_data(s1, s2);
			/*
			 * System.out.println("================"); for (Patient p : list) {
			 * System.err.println(list); }
			 */
			System.out.println("================");
			list.forEach(p -> System.out.println(p));
			System.out.println("================");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
