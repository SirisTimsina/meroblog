package com.meroapp.meroblog.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="blog_category")
public class BlogCategory implements Serializable{
	
	private static final long serialVersionUID = 1233121L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bc_id")
	private int id;
	private String title;
	private String description;
	private String type;
	private String content;
	
	
	public BlogCategory() {
		super();
	}


	public BlogCategory(int id, String title, String description, String type, String content) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.type = type;
		this.content = content;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}
	
	

}
