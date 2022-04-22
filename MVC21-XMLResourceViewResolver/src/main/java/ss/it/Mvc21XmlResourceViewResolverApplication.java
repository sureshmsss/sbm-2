package ss.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.XmlViewResolver;

@SpringBootApplication
public class Mvc21XmlResourceViewResolverApplication {
	@Bean
	public ViewResolver createXVResolver() {
		System.out.println("Mvc21XmlResourceViewResolverApplication.createXMLVResolver()");
		XmlViewResolver res = new XmlViewResolver();
		res.setLocation(new ClassPathResource("ss/it/commons/views.xml"));
		return res;
	}

	public static void main(String[] args) {
		SpringApplication.run(Mvc21XmlResourceViewResolverApplication.class, args);
	}

}
