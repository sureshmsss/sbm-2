package ss.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test-C")
public class TestController {
	@GetMapping("wish")
	public String message()  {
		System.out.println("TestController.getMsg()");
		return "show";
	}

}
