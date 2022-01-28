package ss.it.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ss.it.model.Student;

@Repository
public class StudentDaoimpl implements IStudentDao {
	@Autowired
	private DataSource ds;
	private static final String getStudentList = "select id, name, total, average, result from Student_data where result in(?)";

	@Override
	public List<Student> getList(String result) throws Exception {
		// create conn object
		Connection conn = ds.getConnection();

		// create prepared statement
		PreparedStatement ps = conn.prepareStatement(getStudentList);

		// set query params
		ps.setString(1, result);

		// execute query
		ResultSet rs = ps.executeQuery();

		// process the result set
		List list = new ArrayList();
		Student s = new Student();
		
		if (rs == null) {
			System.out.println("list is not empty");
		} else {
			System.out.println("list is empty");
		}

		while (rs.next()) {
			s.setId(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setTotal(rs.getInt(3));
			s.setAverage(rs.getFloat(4));
			s.setResult(rs.getString(5));

			list.add(s);
		}

		return list;
	}

}
