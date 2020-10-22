package com.meroapp.meroblog.dao;

import org.springframework.stereotype.Repository;

import com.meroapp.meroblog.model.UserDetail;


public interface UserDao {

	public void saveUser(UserDetail ud);
	
	
}
