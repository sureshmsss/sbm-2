package ss.it.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "My_address")
@Data
public class My_Address {
	@Id
	@GeneratedValue
	private Integer doorNo;
	@Column(length = 20)
	private String colony;
	@Column(length = 25)
	private String city_State;

	@Override
	public String toString() {
		return "My_Address [doorNo=" + doorNo + ", colony=" + colony + ", city_State=" + city_State + "]";
	}

}
