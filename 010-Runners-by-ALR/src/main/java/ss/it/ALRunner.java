package ss.it;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ALRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// System.out.println("ALRunner.run() from : " + this.getClass());
		// System.out.println("args are : " + args.toString());
		System.out.println(args.getNonOptionArgs());
		System.out.println(args.getOptionNames());

	}

}
