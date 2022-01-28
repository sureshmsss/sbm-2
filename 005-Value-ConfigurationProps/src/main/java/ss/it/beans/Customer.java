package ss.it.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("sss")
@Data
//@PropertySource("classpath:user.properties")
@ConfigurationProperties(prefix="per")
public class Customer {
	private String name;
 	private Integer uid;
 	private int age;
 }
