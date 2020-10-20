package com.meroapp.meroblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meroapp.meroblog.dao.CategoryDao;
import com.meroapp.meroblog.model.BlogCategory;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryDao categoryDao;
	
	@Override
	public void addNewCategory(BlogCategory category) {
		
		categoryDao.saveCategory(category);
	}
	

	@Override
	public List<BlogCategory> findAllCategories() {
		
		
		return categoryDao.getAllCategories();
	}


	@Override
	public BlogCategory findById(int id) {
		
		return categoryDao.getCategoryById(id);

	}


	@Override
	public void editCategory(BlogCategory category) {
		categoryDao.updateCateogry(category);
	}


	@Override
	public void deleteCategory(BlogCategory category) {
		categoryDao.deleteCategory(category);
	}

	
	
}
