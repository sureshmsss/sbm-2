package ss.it.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import ss.it.model.Tourist;

@Repository
@Profile({ "uat", "prod" })
public class TPDaoImplMysql implements ITPDao {
	private static final String GET_PLACES_BY_LOCATION = "select state,place,type from sbm.tourist_data where state in(?)";
	@Autowired
	private DataSource ds;

	
	@Override
	public List<Tourist> getTourist_Places(String location) throws Exception {
		System.out.println("o-param of " + this.getClass());
		System.out.println("ds from " + ds.getClass());
		List<Tourist> list = null;

		try (Connection conn = ds.getConnection();
				PreparedStatement ps = conn.prepareStatement(GET_PLACES_BY_LOCATION)) {

			// set query param
			ps.setString(1, location);

			// process result set
			try (ResultSet rs = ps.executeQuery()) {
				list = new ArrayList();
				while (rs.next()) {
					Tourist t = new Tourist();
					t.setState(rs.getString(1));
					t.setTouristplace(rs.getString(2));
					t.setType(rs.getString(3));
					list.add(t);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
	}

}
