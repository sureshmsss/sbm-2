package ss.it;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(-10)
public class A3Runner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("this is : " + this.getClass());
		System.out.println("from : " + Arrays.toString(args));
	}

}
