package ss.it.service;

import java.util.List;

import ss.it.entity.Employee;

public interface IEmployeeService {
	public List<Employee> fetchAllEmpsByDesg(String desg1, String desg2);

}
