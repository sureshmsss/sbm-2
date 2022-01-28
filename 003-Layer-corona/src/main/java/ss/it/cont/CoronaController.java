package ss.it.cont;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ss.it.model.Patient;
import ss.it.service.ICoronaService;

@Controller
public class CoronaController {

	@Autowired
	private ICoronaService service;

	public List<Patient> show_patient_data(String city1, String city2) throws Exception {

		List<Patient> list = service.fetchPatients(city1, city2);
		return list;
	}
}
