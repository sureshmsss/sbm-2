package ss.it.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ss.it.model.Patient;


@Controller
public class PatientController {

	@GetMapping("/")
	public String register() {
		// return LVN
		return "welcome";
	}

	@GetMapping("/register")
	public String registerPatient() {
		//return LVN
		return "patient_register";
	}

	@PostMapping("/register")
	public String register(Map<String,Object> map,@ModelAttribute("stud") Patient patient) {
		System.out.println(patient);
		//return lvn 
		return "show_result";
	}
}
