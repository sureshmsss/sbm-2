package com.test.controller;

import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
/*
		@RequestMapping("/wish")
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
	}
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
	@RequestMapping("/wish")
	public void getMsg(HttpServletResponse response) throws Exception {
		// use service
		String msg = service.wishMsg();
	
		// create PrintWriter object
		PrintWriter pw = response.getWriter();
	
		// write o/p to the response object
		
		pw.println("<b>wish</b><br>");
		pw.println("<b>" + msg + "</b><br>");
		pw.println("<b>" + new Date() + "</b><br>");
	}
	@RequestMapping("/wish1")
	public void getMsg1(HttpServletResponse response) throws Exception {
		// use service
		String msg = service.wishMsg();
	
		// create PrintWriter object
		PrintWriter pw = response.getWriter();
	
		// write o/p to the response object
		pw.println("<b>wish1</b><br>");
		pw.println("<b>" + msg + "</b><br>");
		pw.println("<b>" + new Date() + "</b><br>");
	}
	@RequestMapping({"/wish1","/wish"})
	public void getMsg(HttpServletResponse response) throws Exception {
		// use service
		String msg = service.wishMsg();
	
		// create PrintWriter object
		PrintWriter pw = response.getWriter();
	
		// write o/p to the response object
		pw.println("<b>wish1</b><br>");
		pw.println("<b>" + msg + "</b><br>");
		pw.println("<b>" + new Date() + "</b><br>");
	}
	@RequestMapping("/")//this works without index.jsp but above all need index.jsp to forward the request
	public String getMsg(HashMap<String, Object> map) {
		// use service
		String msg = service.wishMsg();
		// add attributes
		map.put("msg", msg);
		map.put("sysDate", new Date());
		return "show_result";
	}*/
	@RequestMapping//no path given so default request path is "/"
	public String getMsg(HashMap<String, Object> map) {
		// use service
		String msg = service.wishMsg();
		// add attributes
		map.put("msg", msg);
		map.put("sysDate", new Date());
		return "show_result";
	}
}
