package ss.it;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Bean
	public CommandLineRunner getCLR() {
		System.out.println("===================");
	/*	CommandLineRunner clr = args -> {
			System.out.println("from FI+Enhanced For Loop ");
			for (String arg : args) {
				System.out.println(arg);
			}
		};
		return clr;   */
		return args -> {
			System.out.println("from FI+Enhanced For Loop ");
			for (String arg : args) {
				System.out.println(arg);
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
