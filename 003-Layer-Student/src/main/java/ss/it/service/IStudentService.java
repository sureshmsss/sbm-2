package ss.it.service;

import java.util.List;

import ss.it.model.Student;

public interface IStudentService {
	public List<Student> getList(String result) throws Exception;

}
