package ss.it.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "My_accountDetails")
@Data
public class My_AccountDetails {
	@Id
	@GeneratedValue(generator = "increment")
	private Long acno;
	@Column(length = 20)
	private String acType;

	@Override
	public String toString() {
		return "My_AccountDetails [acno=" + acno + ",  acType=" + acType + "]";
	}

}
