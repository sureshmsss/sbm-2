package ss.it.model;

import lombok.Getter;
import lombok.Setter;
//@Data=setters+getters+toString
@Setter
@Getter
public class Student {
	private Integer id;
	private String name;
	private Integer total;
	private float average;
	private String result;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", total=" + total + ", average=" + average + ", result="
				+ result + "\n]";
	}

	
}
