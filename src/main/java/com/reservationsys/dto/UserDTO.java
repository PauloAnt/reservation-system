package com.reservationsys.dto;

import java.io.Serializable;

import com.reservationsys.entities.User;

public class UserDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	String id;
	String username;
	String email;
	String password;
	
	public UserDTO() {}
	
	public UserDTO(User obj) {
		this.id = obj.getId();
		this.username = obj.getUsername();
		this.email = obj.getEmail();
		this.password = obj.getPassword();
	}

	public String getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
