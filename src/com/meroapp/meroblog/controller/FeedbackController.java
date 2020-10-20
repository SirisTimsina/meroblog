package com.meroapp.meroblog.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.meroapp.meroblog.dao.FeedbackDao;
import com.meroapp.meroblog.model.Feedback;

@Controller
public class FeedbackController {

	@Autowired
	FeedbackDao feedbackDao;
	
	@RequestMapping(value="/feedback", method=RequestMethod.GET)
	public String openFeedBack() {
		return "feedback";
	}
	
	@RequestMapping(value="/feedback", method=RequestMethod.POST)
	public String saveFeedBack(@RequestParam("uname") String uname,
			@RequestParam("subject") String subject,
			@RequestParam("message") String message) {
		
		Feedback fb = new Feedback();
		fb.setMessage(message);
		fb.setSendDate(LocalDate.now());
		fb.setSubject(subject);
		fb.setUsername(uname);
		
		// call dao method to save feedback object
		
		feedbackDao.insertFeedback(fb);
		
		return "redirect:/feedback";
	}
}

