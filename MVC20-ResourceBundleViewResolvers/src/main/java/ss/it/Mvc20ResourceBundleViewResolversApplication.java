package ss.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

@SpringBootApplication
public class Mvc20ResourceBundleViewResolversApplication {

	@Bean
	public ViewResolver createRBVResolver() {
		System.out.println("Mvc20ResourceBundleViewResolversApplication.createRBVResolver()");
		ResourceBundleViewResolver res = new ResourceBundleViewResolver();
		res.setBasename("/ss/it/commons/views");
		return res;
	}

	public static void main(String[] args) {
		SpringApplication.run(Mvc20ResourceBundleViewResolversApplication.class, args);
	}

}
