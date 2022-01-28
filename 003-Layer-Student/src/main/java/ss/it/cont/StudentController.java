package ss.it.cont;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ss.it.model.Student;
import ss.it.service.IStudentService;
@Controller
public class StudentController {
	@Autowired
	private IStudentService service;

	public List<Student> getList(String result) throws Exception {

		// use service
		List<Student> list = service.getList(result);
		return list;
	}

}
