package ss.it.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix = "d.c")
public class Voter {

	//normal properties
	private String fname;
	private String id;
	//private Details details;

	
	// Array property
	private String[] name;
	// set Collection property
	private Set<String> dept;
	// List Collection property
	private List<String> city;
	// Map Collection property
	private Map<String, Object> phNo;

}
