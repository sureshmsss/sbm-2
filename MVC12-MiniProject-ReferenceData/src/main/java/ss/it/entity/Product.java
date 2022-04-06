package ss.it.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.Data;

@Data
@Entity
@Table(name = "product")
@SQLDelete(sql = "update product set status='inactive' where pid=?")
@Where(clause = "status<> 'inactive'")
public class Product {

	@Id
	@GeneratedValue
	private Integer pid;
	private String pname;
	private Float price;
	private Float qty;
	@Transient
	private String vflag = "no";
	private String country = "India";
	
}
