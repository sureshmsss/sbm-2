package ss.it.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "My_phoneNumber")
@Setter
@Getter
public class My_PhoneNumber implements Serializable {
	@Id
	@GeneratedValue
	private Integer regNo;
	private Long phoneNumber;
	@Column(length = 20)
	private String numberType;
	@Column(length = 20)
	private String provider;

	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", phoneNumber=" + phoneNumber + ", numberType=" + numberType
				+ ", provider=" + provider + "]";
	}

}
