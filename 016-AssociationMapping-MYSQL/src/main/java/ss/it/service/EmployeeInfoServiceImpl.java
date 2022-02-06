package ss.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ss.it.entity.EmployeeInfo;
import ss.it.repo.IEmployeeInfoRepo;

@Component
public class EmployeeInfoServiceImpl implements IEmployeeInfoService {
	@Autowired
	private IEmployeeInfoRepo repo;

	@Override
	public String registerEmployee(EmployeeInfo info) {
		return "emp saved with " + repo.save(info);
	}

	@Override
	public List<EmployeeInfo> fetchAllEmps() {
		return repo.findAll();
	}

}
