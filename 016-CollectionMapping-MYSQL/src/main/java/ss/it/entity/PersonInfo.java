package ss.it.entity;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "AM_Person_info")
@Setter
@Getter
public class PersonInfo implements Serializable {
	@Id
	@SequenceGenerator(name = "gen1", initialValue = 1000, allocationSize = 1, sequenceName = "pid_seq1")
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer pid;
	@Column(length = 20)
	private String pname;
	@Column(length = 20)
	private String padd;
	@OneToMany(targetEntity = PhoneNumber.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "person_id", referencedColumnName = "pid")
	private Set<PhoneNumber> phonesInfo;

	@Override
	public String toString() {
		return "EmployeeInfo [pid=" + pid + ", pname=" + pname + ", padd=" + padd + ", phonesInfo=" + phonesInfo + "]";
	}

}
