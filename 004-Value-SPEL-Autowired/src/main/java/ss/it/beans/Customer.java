package ss.it.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@PropertySource("classpath:user.properties")
public class Customer {
	@Value("${per.name}")
	private String name;
	@Value("${per.uid}")
	private Integer uid;
	@Value("${per.age}")
	private int age;
	@Value("${path}")
	private String path;
	@Value("${os.name}")
	private String osname;
	@Value("#{address}")
	private Address add;
	@Value("#{address.a+address.b}")
	private int xxx;

}
