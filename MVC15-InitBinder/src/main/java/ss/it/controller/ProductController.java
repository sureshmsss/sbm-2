package ss.it.controller;

import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ss.it.entity.Product;

@Controller
public class ProductController {

	@GetMapping("/")
	public String showHome() {
		System.out.println("showHome()");
		// return LVN name
		return "home";
	}

	@GetMapping("/register")
	public String showStatusPage(@ModelAttribute("product") Product product) {
		System.out.println("showStatusPage()");
		// return LVN
		return "product_register";
	}

	@PostMapping("/register")
	public String registerProduct(@ModelAttribute("product") Product product) {
		System.out.println("registerProduct() " + product);
		// return LVN
		return "show_result";
	}

	@InitBinder
	public void myDateBinder(WebDataBinder binder) {
		System.out.println("myDateBinder()");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(sdf, true));
	}
}
