package ss.it.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ss.it.model.Product;

//make sure that other controller class handler methods or mappings in comment mode

@Controller
public class ModelController {
	//@GetMapping
	public String productValues(Map<String, Object> map) {
		System.out.println("ModelController.productValues()");
		Product product = new Product("mobile", 15000f, 1);
		map.put("product", product);
		return "show_model";
	}

}
