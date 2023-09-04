package com.spring.boot.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "users")
public class User {

	@Id
	private Long userId;
	private String userName;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}
}
