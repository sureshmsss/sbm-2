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
@Table(name = "Aclink")
@Setter
@Getter
public class AC_link implements Serializable {
	@Id
	@GeneratedValue
	private Integer acNo;
	@Column
	private String bank;
	@Column
	private Integer pid;

	@Override
	public String toString() {
		return "AC_link [acNo=" + acNo + ", bank=" + bank + ", panId=" + pid + "]";
	}

}
