package ss.it.runner;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import oracle.jdbc.internal.OracleTypes;

/*CREATE OR REPLACE FUNCTION FX_GET_MOVIES_BY_RATINGS
(
  START_RATING IN NUMBER  
, END_RATING IN NUMBER  
, CNT OUT NUMBER  
) RETURN SYS_REFCURSOR AS 
DETAILS SYS_REFCURSOR;
BEGIN
SELECT COUNT(*) INTO CNT FROM MOVIE;
OPEN DETAILS FOR
SELECT NAME,RATING,TIME FROM MOVIE WHERE RATING>=START_RATING AND RATING<=END_RATING;
  RETURN DETAILS;
END FX_GET_MOVIES_BY_RATINGS;
*/

@Component
public class RepoRunner implements CommandLineRunner {
	@Autowired
	private EntityManager manager;

	@Override
	public void run(String... args) throws Exception {
		// unwrap the session
		Session ses = manager.unwrap(Session.class);
/*
		// work with ReturningWork(T) callback based callback method
		Object result[] = ses.doReturningWork(con -> {
			CallableStatement cs = con.prepareCall("{?=call FX_GET_MOVIES_BY_RATINGS(?,?,?)}");

			// register return(1), out params(4) with jdbc types
			cs.registerOutParameter(1, OracleTypes.CURSOR);
			cs.registerOutParameter(4, Types.INTEGER);

			// set values to IN PARAMS
			cs.setString(2, "4.0");
			cs.setString(3, "4.6");

			// call pl/sql function
			cs.execute();

			// gather results from out parameters
			ResultSet rs = (ResultSet) cs.getObject(1);
			List<Object[]> list = new ArrayList();

			while (rs.next()) {
				Object record[]=new Object[3] ;
				record[0]=rs.getString(1));
				record[1] = rs.getString(2);
				record[2] = rs.getShort(3);
				list.add(record);
			} // while
			Object data[] = new Object[2];
			data[0] = list;
			data[1] = cs.getInt(4);
			//System.out.println(list+"=>"+cs.getInt(4));
			return data;
		});
		// process result set
	/*	System.out.println("movie ratings are");
		List<Object[]> ratings = (List<Object[]>) result[0];
		ratings.forEach(md -> {
			for (Object val : md)
				System.out.println(val + " ");
			System.out.println();

		});
//get count of records
		int count = (int) result[1];
		System.out.println("count : " + count);
*/
		
	}

}
