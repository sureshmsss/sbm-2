package ss.it.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OracleSQL {

	private static final String query = "select * from student_data";

	@Autowired
	private DataSource ds;

	public List getrows() throws Exception {

		System.out.println("datasource from " + ds.getClass());
		Connection conn = ds.getConnection();

		// create the Statement obj
		PreparedStatement ps = conn.prepareStatement(query);

		ResultSet rs = ps.executeQuery();

		// execute query
		List<Student> list = new ArrayList();

		// create object of Student
		Student s = null;

		while (rs.next()) {
			s = new Student();
			s.setId(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setTotal(rs.getFloat(3));
			s.setAverage(rs.getFloat(4));
			s.setResult(rs.getString(5));
			list.add(s);
		}

		rs.close();
		ps.close();
		conn.close();
		return list;
	}

	public int getCount() throws Exception {
		Connection conn = ds.getConnection();
		PreparedStatement ps = conn.prepareStatement("select count(*) from student_data");
		ResultSet rs = ps.executeQuery();
		rs.next();
		int count = rs.getInt(1);
		rs.close();
		ps.close();
		conn.close();

		return count;
	}
}
