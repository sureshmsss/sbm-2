package ss.it;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class BRunner2 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CR : " + this.getClass());
		System.out.println("from : " + Arrays.toString(args));

	}

}
