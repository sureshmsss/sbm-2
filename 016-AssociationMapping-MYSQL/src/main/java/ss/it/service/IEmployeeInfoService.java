package ss.it.service;

import java.util.List;

import ss.it.entity.EmployeeInfo;

public interface IEmployeeInfoService {

	public String registerEmployee(EmployeeInfo info);

	public List<EmployeeInfo> fetchAllEmps();
}
