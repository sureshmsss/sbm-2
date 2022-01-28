package ss.it.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Employee implements Serializable {

	// properties
	@Id
	@GeneratedValue
	private Integer eno;
	private String ename;
	private String desg;
	private Float salary;
}
