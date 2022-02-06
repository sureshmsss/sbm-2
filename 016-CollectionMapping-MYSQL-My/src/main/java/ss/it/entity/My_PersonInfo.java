package ss.it.entity;

import java.io.Serializable;
import java.util.List;
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
@Table(name = "MY_Person_info")
@Setter
@Getter
public class My_PersonInfo implements Serializable {
	@Id
//	@SequenceGenerator(name = "gen2", initialValue = 1000, allocationSize = 1, sequenceName = "cid_seq1")
	@GeneratedValue(generator = "increment")
	private Long c_uid;
	@Column(length = 20)
	private String cname;
	@OneToMany(targetEntity = My_Address.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "person_id", referencedColumnName = "c_uid")
	private List<My_Address> cadd;
	@OneToMany(targetEntity = My_AccountDetails.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "person_id", referencedColumnName = "c_uid")
	private List<My_AccountDetails> c_account;
	@OneToMany(targetEntity = My_PhoneNumber.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "person_id", referencedColumnName = "c_uid")
	private Set<My_PhoneNumber> phonesInfo;

	@Override
	public String toString() {
		return "My_PersonInfo [c_uid=" + c_uid + ", cname=" + cname + ", cadd=" + cadd + ", c_account=" + c_account
				+ ", phonesInfo=" + phonesInfo + "]";
	}

}
