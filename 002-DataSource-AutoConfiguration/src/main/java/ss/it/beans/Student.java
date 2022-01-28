package ss.it.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {

	// properties
	private int id;
	private String name;
	private float total;
	private float average;
	private String result;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", total=" + total + ", average=" + average + ", result="
				+ result + "\n]";
	}

}
