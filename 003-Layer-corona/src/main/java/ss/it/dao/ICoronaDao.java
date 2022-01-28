package ss.it.dao;

import java.util.List;

import ss.it.model.Patient;

public interface ICoronaDao {

	public List<Patient> getPatients(String city1, String city2) throws Exception;

}
