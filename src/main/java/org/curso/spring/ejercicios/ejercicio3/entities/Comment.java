package org.curso.spring.ejercicios.ejercicio3.entities;

import java.util.Date;

public class Comment {
	
	private int id;
	
	private String content;
	
	private User author;
	
	private Date createdDate;
	
	private Date updatedDate;

	public Comment() {
		// TODO Auto-generated constructor stub
		this.createdDate = new Date();
		this.updatedDate = this.createdDate;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
