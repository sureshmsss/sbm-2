package ss.it.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.annotations.ListIndexBase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Employee_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeInfo implements Serializable{
	@Id
	@GeneratedValue
	private Integer eid;
	@Column(length=20)
	private String ename;
	@ElementCollection
	@CollectionTable(name="friends",joinColumns = @JoinColumn(name="emp_id",referencedColumnName = "eid"))
	@OrderColumn(name="friend_index")
	@ListIndexBase(value=1)
	@Column(name="friend_name",length=20)
	private List<String> friends;
	@ElementCollection
	@CollectionTable(name="phones",joinColumns = @JoinColumn(name="emp_id",referencedColumnName = "eid"))
	@Column(name="phno",length=11)
	private Set<Long> phNos;
	
	@ElementCollection
	@CollectionTable(name="id_details",joinColumns = @JoinColumn(name="emp_id",referencedColumnName = "eid"))
	@MapKeyColumn(name="card_type",length=20)
	@Column(name="card_no",length=30)
	private Map<String,String> idDetails;
}
