package ss.it.model;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JobSeekerData implements Serializable {
	private int jsId;
	private String jsName;
	private String address;
	private MultipartFile photo;
	private MultipartFile resume;
}
