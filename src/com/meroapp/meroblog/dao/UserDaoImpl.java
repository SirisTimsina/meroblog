package com.meroapp.meroblog.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.meroapp.meroblog.model.UserDetail;
import com.meroapp.meroblog.model.UserRole;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void saveUser(UserDetail ud) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		UserRole ur = new UserRole();
		ur.setRole(ud.getAuthority());
		
		ud.setUserRole(ur);
		ur.setUserDetail(ud);
		
		session.save(ud);
		
		session.getTransaction().commit();
		session.close();
		
	}

}
