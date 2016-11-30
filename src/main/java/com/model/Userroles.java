package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Userroles {
	@Column
	private String role;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private String role_id;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="USERNAME")
	private Newuser newuser;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getRole_id() {
		return role_id;
	}
	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
	public Newuser getNewuser() {
		return newuser;
	}
	public void setNewuser(Newuser newuser) {
		this.newuser = newuser;
	}
	
	
}
