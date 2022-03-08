package ss.it.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ss.it.service.IService;

@Controller
public class WishController {

	@Autowired
	private IService service;

	@RequestMapping("/home")
	public String wish() {
		// return lvn
		return "myWish";
	}

	@RequestMapping("/wish")
	public ModelAndView wishing() {
		String msg = service.createMessage();
		// create Model and View Object
		ModelAndView mav = new ModelAndView();
		LocalDateTime time = LocalDateTime.now();
		mav.addObject("msg", msg);
		mav.addObject("time", time);
		mav.setViewName("show");
		return mav;
	}

	@RequestMapping("/status")
	public ModelAndView serverinfo() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", service.server());
		mav.setViewName("network");
		return mav;
	}

}
