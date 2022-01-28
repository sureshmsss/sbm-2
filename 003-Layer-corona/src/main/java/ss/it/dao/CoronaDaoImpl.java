package ss.it.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ss.it.model.Patient;
@Repository
public class CoronaDaoImpl implements ICoronaDao {
	private static final String GET_PATIENTS_BY_CITY = "select id,name,status,city from corona_data where city in(?,?)";
	// properties
	@Autowired
	private DataSource ds;

	@Override
	public List<Patient> getPatients(String city1, String city2) throws Exception {
		List list = null;

		// create connection object
		try (Connection conn = ds.getConnection(); PreparedStatement ps = conn.prepareStatement(GET_PATIENTS_BY_CITY)) {

			// create Result Set object

			// set query param values
			ps.setString(1, city1);
			ps.setString(2, city2);

			// copy result set to list object
			try (ResultSet rs = ps.executeQuery()) {
				list = new ArrayList();
				while (rs.next()) {
					Patient p = new Patient();
					p.setId(rs.getInt(1));
					p.setCity(rs.getString(2));
					p.setStatus(rs.getString(3));
					p.setName(rs.getString(4));
					list.add(p);

				} // while
			} // try2
		} // try1
		catch (SQLException e) {
			e.printStackTrace();
			throw e;//exception rethrowing
		} catch (Exception e) {
			e.printStackTrace();
			throw e;//exception rethrowing
		}
		return list;
	}//method

}//class
