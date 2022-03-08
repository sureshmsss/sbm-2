package com.test.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.service.IService;

@Controller
public class WishMsgController {
	@Autowired
	private IService service;

	@RequestMapping("/home")
	public String show() {
		// return LVN
		return "welcome";
	}

	/*	@RequestMapping("/wish")
		public ModelAndView getMsg() {
			// use service
			String msg = service.wishMsg();
	
			// create MAV
			ModelAndView mav = new ModelAndView();
			mav.addObject("msg", msg);
			mav.addObject("sysDate", new Date());
			mav.setViewName("show_result");
			return mav;
		}
	
	@RequestMapping("/wish")
	public String getMsg(HashMap<String, Object> map) {
		// use service
		String msg = service.wishMsg();
		// add attributes
		map.put("msg", msg);
		map.put("sysDate", new Date());
		return "show_result";
	}
	 @RequestMapping("/wish")
	public String getMsg(HashMap<String, Object> map) {
		// use service
		String msg = service.wishMsg();
		// add attributes
		map.put("msg", msg);
		map.put("sysDate", new Date());
		return "show_result";
	} @RequestMapping("/wish")
	public String getMsg(Map<String, Object> map) {
		// use service
		String msg = service.wishMsg();
		// add attributes
		map.put("msg", msg);
		map.put("sysDate", new Date());
		return "show_result";
	}
	@RequestMapping("/wish")
	public Map<String, Object> getMsg() {
		// use service
		String msg = service.wishMsg();
		// create map object
		Map<String, Object> map = new HashMap<String, Object>();
		// add attributes
		map.put("msg", msg);
		map.put("sysDate", new Date());
		return map;
	}

	// we are taking void its no return type so no data will be stored in DS memory
	@RequestMapping("/wish")
	public void getMsg() {
		// use service
		String msg = service.wishMsg();
		// create map object
		Map<String, Object> map = new HashMap<String, Object>();
		// add attributes
		map.put("msg", msg);
		map.put("sysDate", new Date());
		// return map;
	}*/
	// we are returning null so no data will be stored in DS memory
	@RequestMapping("/wish")
	public void getMsg() {
		// use service
		String msg = service.wishMsg();
		// create map object
		Map<String, Object> map = new HashMap<String, Object>();
		// add attributes
		map.put("msg", msg);
		map.put("sysDate", new Date());
		// return map;
	}
}
