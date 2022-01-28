package ss.it.dao;

import java.util.List;

import ss.it.model.Student;

public interface IStudentDao {

	public List<Student> getList(String result) throws Exception;

}
