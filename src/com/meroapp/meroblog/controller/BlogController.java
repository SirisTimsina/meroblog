package com.meroapp.meroblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BlogController {
// Secondary controller 
	
//	* Primary Controller is DispatcherServlet
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String openHome() {
		return "index";
	}
	
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String appHome() {
		return "index";
		
	}
	
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String appAbout() {
		return "about";  // returns view_name
		
	}
	
}
