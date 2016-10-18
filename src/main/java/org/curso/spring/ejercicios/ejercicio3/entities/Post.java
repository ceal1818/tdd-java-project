package org.curso.spring.ejercicios.ejercicio3.entities;

import java.util.Date;
import java.util.List;

public class Post {

	private int id;
	
	private String title;
	
	private String content;
	
	private String status;
	
	private Date createdDate;
	
	private Date updatedDate;
	
	private User author;
	
	private int likes;
	
	private List<String> hashtags;
	
	private List<Comment> comments;
	
	public Post() {
		this.createdDate = new Date();
		this.updatedDate = this.createdDate;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public List<String> getHashtags() {
		return hashtags;
	}

	public void setHashtags(List<String> hashtags) {
		this.hashtags = hashtags;
	}

	public List<Comment> getComments() {
		return comments;
	}
	
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", content=" + content
				+ ", status=" + status + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + ", author=" + author
				+ ", likes=" + likes + ", hashtags=" + hashtags + ", comments="
				+ comments + "]";
	}
	
	
}
