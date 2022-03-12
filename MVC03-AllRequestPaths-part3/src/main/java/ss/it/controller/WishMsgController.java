package ss.it.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/wish-C")
public class WishMsgController {

	@GetMapping("/wish")
	public String message() {
		System.out.println("WishMsgController.message()");
		System.out.println("===");
		return "show";
	}

	/*@GetMapping
	public String message1() {
		System.out.println("WishMsgController.message1()");
		//return "redirect:test-C/wish";
		return "redirect:wish";//taking network round trip with browser
	}*/

	// here ses obj creation will done by req obj Bcoz method executes per req
	@GetMapping
	public String message1(HttpSession ses) {
		System.out.println("WishMsgController.message1()");
		System.out.println("message1() : " + ses.getId());
		System.out.println("message1() : " + ses.getCreationTime());
		System.out.println("message1() : " + ses.getClass());
		System.out.println("message1() : " + ses.getServletContext());

		// navigation takes place to the path of TestController class
		return "redirect:test-C/wish";
		// navigation takes place in the current class it self
		// return "redirect:wish";// taking network round trip with browser
	}

}
