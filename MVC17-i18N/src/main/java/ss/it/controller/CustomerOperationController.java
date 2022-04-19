package ss.it.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import ss.it.model.Customer;

@Controller
public class CustomerOperationController {
	@GetMapping("/")
	public String showHome() {
		// return LVN
		return "home";
	}

	@GetMapping("/register")
	public String showCustomerFormPage(@ModelAttribute("cust") Customer customer, Map<String, Object> map) {
		// return LVN
		return "customer_register";
	}

}
