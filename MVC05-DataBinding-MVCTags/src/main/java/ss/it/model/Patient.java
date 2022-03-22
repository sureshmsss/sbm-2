package ss.it.model;

import lombok.Data;

@Data
public class Patient {
	private String name;
	private Integer age;
	private String problem;
	private String vaccineStatus;

}
