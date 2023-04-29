package com.sunbeam;

import java.util.Date;

public class Quote {
	private int id;
	private String quote;
	private String author;
	private int userId;
	private Date createdAt;
	public Quote() {
		// TODO Auto-generated constructor stub
	}
	public Quote(int id, String quote, String author, int userId, Date createdAt) {
		this.id = id;
		this.quote = quote;
		this.author = author;
		this.userId = userId;
		this.createdAt = createdAt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "Quote [id=" + id + ", quote=" + quote + ", author=" + author + ", userId=" + userId + ", createdAt="
				+ createdAt + "]";
	}
}
