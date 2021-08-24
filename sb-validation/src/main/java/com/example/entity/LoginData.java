package com.example.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginData {

	
	@NotBlank(message = "user name can't be empty!!")
	
	@Size(min = 3,max = 20,message = "user name must be 3 to 20 character!!")
	private String userName;

	@Pattern( regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.]+[.]+[com]+$", message = "Invalid email!!!")
	private String email;
	
	private boolean agree;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public boolean isAgree() {
		return agree;
	}

	public void setAgree(boolean agree) {
		this.agree = agree;
	}

	public LoginData(String userName, String email) {
		super();
		this.userName = userName;
		this.email = email;
	}

	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}

}
