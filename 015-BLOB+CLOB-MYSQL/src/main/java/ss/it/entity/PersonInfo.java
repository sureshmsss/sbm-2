package ss.it.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="person_info_lob")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonInfo implements Serializable{
	@Id
	@GeneratedValue
	private Integer pid;
	@Column(length=20)
	private String pname;
	@Column
	private LocalDateTime dob;
	private boolean married;
	@Lob
	private byte[] photo;
	@Lob
	private char[] resume;

}
