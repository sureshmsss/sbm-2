package ss.it.document;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("MyCollection")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyCollection implements Serializable {

	@Id
	private Long id;
	private String name;
	private List<String> friends;
	private Set<Long> mobNo;
	private Map<String, Long> bankAc;
	private Properties idDetails;
}
