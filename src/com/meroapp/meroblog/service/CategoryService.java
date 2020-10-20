package com.meroapp.meroblog.service;

import java.util.List;

import com.meroapp.meroblog.model.BlogCategory;

public interface CategoryService {

	public void addNewCategory(BlogCategory category) ;
	
	public List<BlogCategory> findAllCategories();
	
	public BlogCategory findById(int id);
	
	public void editCategory(BlogCategory category);
	
	public void deleteCategory(BlogCategory category);
	
}
