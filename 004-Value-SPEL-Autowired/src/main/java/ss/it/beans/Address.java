package ss.it.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class Address {
	@Value("${add.city}")
	private String city;
	@Value("${add.pin}")
	private int pincode;
	@Value("${a.a}")
	private int a;
	@Value("${a.b}")
	private int b;

}
