package ss.it.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ss.it.entity.Employee;
@Component
public class EmployeeServiceImpl implements IEmployeeService{
	@Autowired
	private EntityManager manager;

	@Override
	public List<Employee> fetchAllEmpsByDesg(String desg1, String desg2) {
		// create a Stroed procedure
		StoredProcedureQuery query = manager.createStoredProcedureQuery("p_get_emps_by_job", Employee.class);

		// register parameter with jdbc types
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);

		// set values to IN params
		query.setParameter(1, desg1);
		query.setParameter(2, desg2);

		// call the pl/sql resultset and get ResultSet
		List<Employee> list = query.getResultList();
		return list;
	}

}
