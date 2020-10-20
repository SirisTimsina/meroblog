package com.meroapp.meroblog.model;

import java.time.LocalDate;

public class Feedback {

	private int id;
	private String subject;
	private String message;
	private String username;
	private LocalDate sendDate;
	
	public Feedback() {
		super();
	}

	public Feedback(int id, String subject, String message, String username, LocalDate sendDate) {
		super();
		this.id = id;
		this.subject = subject;
		this.message = message;
		this.username = username;
		this.sendDate = sendDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDate getSendDate() {
		return sendDate;
	}

	public void setSendDate(LocalDate sendDate) {
		this.sendDate = sendDate;
	}
	
	
	
}
