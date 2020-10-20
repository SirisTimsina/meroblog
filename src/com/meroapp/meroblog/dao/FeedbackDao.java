package com.meroapp.meroblog.dao;

import java.util.List;

import com.meroapp.meroblog.model.Feedback;

public interface FeedbackDao {

	public void insertFeedback(Feedback fb) ;
	
	public List<Feedback> getAllFeedback();
	
	
}
