package com.webosmotic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private String userId;
	
	@Column(name="Name",length=15)
	private String name;
	@Column(name="Email",length=30)
	private String email;
	@Column(name="About",length=100)
	private String about;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userId, String name, String email, String about) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.about = about;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", about=" + about + "]";
	}
	
	

}
