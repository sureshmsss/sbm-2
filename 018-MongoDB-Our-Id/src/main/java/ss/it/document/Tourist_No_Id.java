package ss.it.document;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("tourist1")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tourist_No_Id implements Serializable {

	@Id
	private Integer id;
	private String name;
	private String add;
	private Long mobNo;
	private LocalDateTime time;

}
