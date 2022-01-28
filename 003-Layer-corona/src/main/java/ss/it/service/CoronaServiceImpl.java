package ss.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ss.it.dao.ICoronaDao;
import ss.it.model.Patient;
@Service
public class CoronaServiceImpl implements ICoronaService {
	@Autowired
	private ICoronaDao dao;

	@Override
	public List<Patient> fetchPatients(String city1, String city2) throws Exception {
		
		List<Patient> list=dao.getPatients(city1, city2);
		return list;
	}

}
