package ss.it.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ss.it.service.IWishService;

@Controller
public class ResolversController {

	@Autowired
	private IWishService service;


	@GetMapping("/")
	public String showHome() {
		System.out.println("ProductController.showHome()");
		// return LVN name
		return "home";
	}

	@GetMapping("/wish")
	public String fetchWishMsg(Map<String, Object> map) {
		// use Service
		String msg = service.wish();
		// keep the data in model attributes
		map.put("wmsg", msg);
		map.put("sysDate", new Date());
		return "result";
	}

}
