package ss.it.document;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Tourist implements Serializable {
	@Id
	private String tid;
	private String name;
	private String add;
	private Float budget;
	private Long mobNo;
	private LocalDateTime time;

	@Override
	public String toString() {
		return "Tourist:tid=" + tid + ",name=" + name + ",add=" + add + ",budget=" + budget + ",mobNo=" + mobNo
				+ ",time=" + time;
	}

}
