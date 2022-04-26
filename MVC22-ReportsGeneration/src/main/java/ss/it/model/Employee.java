package ss.it.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "emp")
public class Employee {
	@Id
	@GeneratedValue
	private Integer empno;
	private String ename;
	private String job;
	private Long deptNo;
	private Double sal;
}
