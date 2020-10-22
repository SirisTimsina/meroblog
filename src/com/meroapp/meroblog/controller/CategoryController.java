package com.meroapp.meroblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.meroapp.meroblog.model.BlogCategory;
import com.meroapp.meroblog.service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	
	@GetMapping("/admin/category/add")
	public String addCategory() {
		return "category";
	}

	
	@PostMapping("/admin/category/save")
	public String saveCatrogory(@ModelAttribute("blogCategory") BlogCategory blogCategory) {
		
		categoryService.addNewCategory(blogCategory);
		
		return "redirect:/admin/category/show#cat_table";
	}
	
	@GetMapping("/admin/category/show")
	public String showCategories(Model model) {
		model.addAttribute("categorylist", categoryService.findAllCategories());
		return "category";
	}
	
	
	@GetMapping("/admin/category/edit/{id}")
	public String edditCategory(@PathVariable("id") int id, Model model) {
		model.addAttribute("category", categoryService.findById(id));
		return "category";
	}
	
	@PostMapping("/admin/category/update")
	public String updateCategory(@ModelAttribute("blogCategory") BlogCategory blogCategory) {
		categoryService.editCategory(blogCategory);
		return "redirect:/admin/category/show#cat_table";
	}
	
	@GetMapping("/admin/category/delete/{id}")
	public String deleteCategory(@PathVariable("id") int id) {
		
		BlogCategory cat = new BlogCategory();
		cat.setId(id);
		
//		BlogCategory cat = categoryService.findById(id);
		
		categoryService.deleteCategory(cat);
		
		return "redirect:/admin/category/show#cat_table";
	}
	
	
}
