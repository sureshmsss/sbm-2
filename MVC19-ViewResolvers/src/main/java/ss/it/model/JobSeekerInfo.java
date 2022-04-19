package ss.it.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "OnlinePortal")
public class JobSeekerInfo {
	@Id
	@GeneratedValue
	private int jsId;
	private String jsName;
	private String address;
	@Column(length = 200)
	private String photoPath;
	@Column(length = 200)
	private String resumePath;

}
