package ss.it.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ss.it.model.Product;

//make sure that other controller class handler methods or mappings in comment mode   

@Controller
public class CollectionOfModelController {
	@GetMapping
	public String collectionOfModelValues(Map<String, Object> map) {
		System.out.println("CollectionOfModelController.collectionOfModelValues()");
		List<Product> list = List.of(new Product("mobile", 15000f, 1));
		map.put("product", list);
		return "show_collection_model";
	}

}
