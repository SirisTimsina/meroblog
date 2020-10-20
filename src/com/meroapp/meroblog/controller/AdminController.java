package com.meroapp.meroblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {

	// Request Handler method
	
	
	// mapped to: /admin/home
	@GetMapping("/home")     
	public ModelAndView openDashboard(ModelAndView mv){
		mv.setViewName("admin_panel");
		return mv;
	}
	
	// mapped to: /admin/profile
	@GetMapping("/profile")     
	public ModelAndView openAdminProfile(ModelAndView mv){
		
		return mv;
	}
	
}
