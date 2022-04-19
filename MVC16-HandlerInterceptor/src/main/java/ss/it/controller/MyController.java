package ss.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/")
	public String showHome() {
		System.out.println("showHome()");
		// return LVN name
		return "home";
	}

	@GetMapping("/register")
	public String showStatusPage() {
		System.out.println("showStatusPage()");
		// return LVN
		return "show_result";
	}

}
