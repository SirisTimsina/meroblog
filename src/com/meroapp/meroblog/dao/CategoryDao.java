package com.meroapp.meroblog.dao;

import java.util.List;

import com.meroapp.meroblog.model.BlogCategory;

public interface CategoryDao {
	
	public void saveCategory(BlogCategory category);
	
	public List<BlogCategory> getAllCategories();
	
	public BlogCategory getCategoryById(int id);
	
	public void updateCateogry(BlogCategory category);
	
	public void deleteCategory(BlogCategory category);
	

}
