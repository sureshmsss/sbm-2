package ss.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/wish-C")
public class WishMsgController {
/*	@RequestMapping("/")
	public String show() {
		// return LVN
		return "welcome";
	}

		@GetMapping("/wish")
		public String getMsg() {
			System.out.println("WishMsgController.getMsg()");
			return "show";
		}
	
		@PostMapping("/wish")
		public String postMsg() {
			System.out.println("WishMsgController.postMsg()");
			return "show1";
		}
	
	@GetMapping
	public String message()  {
		System.out.println("WishMsgController.getMsg()");
		return "show";
	}

	@PostMapping
	public String message1(){
		System.out.println("WishMsgController.postMsg()");
		return "show1";
	}

	@GetMapping("wish")
	public String message()  {
		System.out.println("WishMsgController.getMsg()");
		return "show";
	}

	@GetMapping("wish")
	public String message1(){
		System.out.println("WishMsgController.postMsg()");
		return "show1";
	}
	*/
	@GetMapping("/wish")
	public String message()  {
		System.out.println("WishMsgController.getMsg()");
		return "show1";
	}
	@GetMapping
	public String message1()  {
		System.out.println("WishMsgController.getMsg1()");
		return "forward:test-C/wish";
	}

}
