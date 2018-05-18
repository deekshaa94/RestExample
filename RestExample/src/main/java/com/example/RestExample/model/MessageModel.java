package com.example.RestExample.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MessageModel {
	
	private long id;
	private String author;
	private Date date;
	private String message;
	
	
	public MessageModel() {	}
	public MessageModel(long id, String author, String message) {
		super();
		this.id = id;
		this.author = author;
		this.date = new Date();
		this.message = message;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
