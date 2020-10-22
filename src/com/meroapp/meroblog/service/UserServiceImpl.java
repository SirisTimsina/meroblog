package com.meroapp.meroblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meroapp.meroblog.dao.UserDao;
import com.meroapp.meroblog.model.UserDetail;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	UserDao userDao;
	
	
	@Override
	public void registerUser(UserDetail ud) {
		userDao.saveUser(ud);
	}

}
