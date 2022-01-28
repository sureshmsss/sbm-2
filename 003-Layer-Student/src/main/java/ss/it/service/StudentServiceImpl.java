package ss.it.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ss.it.dao.IStudentDao;
import ss.it.model.Student;
@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private IStudentDao dao;

	@Override
	public List<Student> getList(String result) throws Exception {

		// use dao
		List<Student> list = dao.getList(result);
		
		
		return list;
	}

}
