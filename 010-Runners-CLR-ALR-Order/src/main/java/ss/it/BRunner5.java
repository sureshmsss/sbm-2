package ss.it;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(29)
public class BRunner5 implements ApplicationRunner,Ordered {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("this is : " + this.getClass());
		System.out.println("from : " + args.toString());
	}

	@Override
	public int getOrder() {
			return 23;
	}

}
