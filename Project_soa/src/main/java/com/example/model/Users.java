package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
	@Column(name = "user_id")
	private int user_id;
	@Column(name = "user_username")
	private String user_username;
	@Column(name = "user_password")
	private String user_password;
	@Column(name = "user_firstname")
	private String user_firstname;
	@Column(name = "user_surname")
	private String user_surname;
	@Column(name = "user_phonenumber")
	private String user_phonenumber;
	@Column(name = "user_type")
	private String user_type;
	public Users() {
		
	}
	
	public Users(int user_id, String user_username, String user_password, String user_firstname, String user_surname,
			String user_phonenumber, String user_type) {
		super();
		this.user_id = user_id;
		this.user_username = user_username;
		this.user_password = user_password;
		this.user_firstname = user_firstname;
		this.user_surname = user_surname;
		this.user_phonenumber = user_phonenumber;
		this.user_type = user_type;
	}


	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_username() {
		return user_username;
	}
	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_firstname() {
		return user_firstname;
	}
	public void setUser_firstname(String user_firstname) {
		this.user_firstname = user_firstname;
	}
	public String getUser_surname() {
		return user_surname;
	}
	public void setUser_surname(String user_surname) {
		this.user_surname = user_surname;
	}
	public String getUser_phonenumber() {
		return user_phonenumber;
	}
	public void setUser_phonenumber(String user_phonenumber) {
		this.user_phonenumber = user_phonenumber;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	
}
