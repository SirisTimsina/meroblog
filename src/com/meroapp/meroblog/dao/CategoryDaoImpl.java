package com.meroapp.meroblog.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.meroapp.meroblog.model.BlogCategory;

@Repository
@Transactional
public class CategoryDaoImpl implements CategoryDao{
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public void saveCategory(BlogCategory category) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(category);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<BlogCategory> getAllCategories() {
		List<BlogCategory> cl = null;
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query<BlogCategory> q = session.createQuery("from BlogCategory");
		cl = q.getResultList();
		session.getTransaction().commit();
		session.close();
		return cl;
	}

	@Override
	public BlogCategory getCategoryById(int id) {
		BlogCategory cat= null;
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query<BlogCategory> q = session.createQuery("from BlogCategory where id=:cid");
		q.setParameter("cid", id);
		cat = q.uniqueResult();
		session.getTransaction().commit();
		session.close();
		return cat;
	}

	@Override
	public void updateCateogry(BlogCategory category) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(category);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void deleteCategory(BlogCategory category) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(category);
		session.getTransaction().commit();
		session.close();
		
	}
	
	

}
