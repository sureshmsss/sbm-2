package ss.it.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Myid")
@Setter
@Getter
public class Auid implements Serializable {
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String name;
	@Column
	private String add;
	@OneToMany(targetEntity = AC_link.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "pid", referencedColumnName = "id")
	private Set<AC_link> acLink;

	@Override
	public String toString() {
		return "Auid [id=" + id + ", name=" + name + ", add=" + add + ", acLink=" + acLink + "]";
	}

}
