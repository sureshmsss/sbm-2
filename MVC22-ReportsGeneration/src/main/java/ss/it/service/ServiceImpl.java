package ss.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ss.it.model.Employee;
import ss.it.repo.IDAORepository;

@Service
public class ServiceImpl implements IService {
	@Autowired
	private IDAORepository repo;

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

}
