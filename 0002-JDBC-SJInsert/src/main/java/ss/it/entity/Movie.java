package ss.it.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Movie implements Serializable {

	private Integer id;
	private String name;
	private String year;
	private String rating;
}
