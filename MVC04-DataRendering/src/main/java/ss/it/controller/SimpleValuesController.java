package ss.it.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//make sure that other controller class handler methods or mappings in comment mode

@Controller
public class SimpleValuesController {

	//@GetMapping
	public String simpleValues(Map<String, Object> map) {
		System.out.println("SimpleValuesController.simpleValues()");
		map.put("name", "suresh");
		map.put("age", 28);
		map.put("salary", 12.0f);
		map.put("uid", 662311771567l);
		return "show";
	}

}
