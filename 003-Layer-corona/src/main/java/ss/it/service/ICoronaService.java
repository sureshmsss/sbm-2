package ss.it.service;

import java.util.List;

import ss.it.model.Patient;

public interface ICoronaService {

	public List<Patient> fetchPatients(String city1, String city2) throws Exception;
}
