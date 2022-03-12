package ss.it.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//make sure that other controller class handler methods or mappings in comment mode

@Controller
public class CollectionController {

//	@GetMapping 
	public String collectionValues(Map<String, Object> map) {
		System.out.println("CollectionController.collectionValues()");
		map.put("siblings", new String[] { "mahi", "manjula", "anjali" });
		map.put("nickNames", List.of("suri", "suribabu", "bullet"));
		map.put("luckyNos", Set.of(1, 5, 7, 9));
		map.put("unique", Map.of("uid", 662311771567l, "pan", "1516347AGAK", "voterId", "ZA12564OZk"));
		return "show_collection";
	}

}
