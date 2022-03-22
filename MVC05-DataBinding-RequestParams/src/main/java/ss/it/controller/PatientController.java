package ss.it.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ss.it.model.Patient;

@Controller
public class PatientController {

	@GetMapping("/")
	public String register() {
		// return LVN
		return "welcome";
	}

	/*	@GetMapping("/data")
		public String process(@RequestParam("name") String name, @RequestParam("age") Integer age) {
			System.out.println(name + "=>" + age);
			// return LVN
			return "show_result";
		}*/
	/*@GetMapping("/data")
	public String process(@RequestParam String name, @RequestParam Integer age) {
		System.out.println(name + "=>" + age);
		// return LVN
		return "show_result";
	}*/
	/*@GetMapping("/data")
	public String process(@RequestParam String name, @RequestParam(required=false) Integer age) {
		System.out.println(name + "=>" + age);
		// return LVN
		return "show_result";
	}*/
	/*	@GetMapping("/data")
		public String process(@RequestParam String name, @RequestParam(defaultValue = "25") Integer age) {
			System.out.println(name + "=>" + age);
			// return LVN
			return "show_result";
		}*/

	@GetMapping("/data")
	public String process(@RequestParam String name, @RequestParam(name = "saddrs") List<String> addrs) {
		System.out.println(name + "=>" + addrs);
		// return LVN
		return "show_result";
	}
}
