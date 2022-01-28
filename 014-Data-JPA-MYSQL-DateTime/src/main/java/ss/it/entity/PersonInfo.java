package ss.it.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class PersonInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// properties
	@Id
	@GeneratedValue
	private Integer pid;
	private String pname;
	private Float page;
	private LocalDate dob;
	private LocalTime tob;
	private LocalDateTime doj;
}
