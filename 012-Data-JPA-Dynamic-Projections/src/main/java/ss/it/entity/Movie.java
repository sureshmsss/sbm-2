package ss.it.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name = "Movie")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Movie implements Serializable {


	private static final long serialVersionUID = 1L;
	// properties
	@Id
	@Column(name = "id")
	@GeneratedValue
	private Integer id;
	@NonNull
	@Column(name = "name", length = 25)
	private String name;
	@NonNull
	@Column(name = "time", length = 25)
	private String year;
	@NonNull
	@Column(name = "rating", length = 25)
	private String rating;

}
