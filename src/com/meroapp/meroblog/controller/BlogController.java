package com.meroapp.meroblog.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.meroapp.meroblog.model.UserDetail;
import com.meroapp.meroblog.service.UploadService;
import com.meroapp.meroblog.service.UserService;

@Controller
public class BlogController {
// Secondary controller 
	
//	* Primary Controller is DispatcherServlet
	
	@Autowired
	UploadService uploadService;
	
	@Autowired
	UserService userService;
	
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
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String registerUser() {
		return "register";  // returns view_name
		
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String registerNewUser(
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("email") String email,
			@RequestParam("mobile") long mobile,
			@RequestParam("dob") String dob,
			@RequestParam("authority") String authority,
			@RequestParam("username") String username,
			@RequestParam("password") String password,
			@RequestParam("cpassword") String cpassword,
			@RequestParam("image") MultipartFile image
			) {
		
		UserDetail ud = new UserDetail();
		ud.setFirstName(firstName);
		ud.setLastName(lastName);
		ud.setEmail(email);
		ud.setMobile(mobile);
		ud.setDob(LocalDate.parse(dob));
		ud.setAuthority(authority);
		if(ud.getAuthority().equals("ROLE_USER")) {
			ud.setActive("1");
		}else {
			ud.setActive("0");
		}
		ud.setUsername(username);
		if(password.equals(cpassword)) {
			ud.setPassword(password);
		}else {
			return "redirect:/register?password_mismatch=true";
		}
		
		ud.setImage(image.getOriginalFilename());  // save image name into database
		// upload image here
		
		if(uploadService.uploadImage(image)) {
			System.out.println("Image uploaded!");
		}
		
		userService.registerUser(ud);
		
		
//		System.out.println(ud.toString());
		
		return "redirect:/register";  // returns view_name
		
	}
	
}
