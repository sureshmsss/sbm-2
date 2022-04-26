package ss.it.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ss.it.model.Employee;
import ss.it.service.IService;

@Controller
public class ReportsController {

	@Autowired
	private IService service;

	@GetMapping("/")
	public String showHome() {
		return "welcome";
	}

	@GetMapping("/report")
	public String showReport(Map<String, Object> map, @RequestParam("type") String type) {
		// use service
		List<Employee> empList = service.getAllEmployees();
		// add results to model attribute
		map.put("empsList", empList);
		// return LVN based on the hyperlink that is clicked
		if (type.equalsIgnoreCase("excel"))
			return "excel_report";
		else
			return "pdf_report";
	}
}
