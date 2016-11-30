package com.model;

import org.hibernate.validator.constraints.NotEmpty;

public class RegistrationBean {
	
	@NotEmpty(message="Name field is mandatory.")
	private String name = null;
	
	@NotEmpty(message="Username field is mandatory.")
	private String username = null;
	
	@NotEmpty(message="Email field is mandatory.")
	private String email = null;
	
	
	@NotEmpty(message="Phone field is mendatory.")
	private String phone;
	
	@NotEmpty(message="Password should not be empty.")
	private String password = null;
	
	@NotEmpty(message="Retype Password should not be empty.")
	private String rePassword = null;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRePassword() {
		return rePassword;
	}
	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}
}
