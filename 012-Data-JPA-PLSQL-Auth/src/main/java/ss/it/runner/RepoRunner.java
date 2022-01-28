package ss.it.runner;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RepoRunner implements CommandLineRunner {
	@Autowired
	private EntityManager manager;

	@Override
	public void run(String... args) throws Exception {
		//create stored procedure query object
		StoredProcedureQuery query=manager.createStoredProcedureQuery("PRO_AUTHENTICATION");
		
		//register parameter with java types
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
		
		//set values to IN params
		query.setParameter(1, "suresh");
		query.setParameter(2, "123456");
		
		//call PL/SQL procedure
		String result=(String) query.getOutputParameterValue(3);
		
		System.out.println("result is "+result);
		
		
	}

}
