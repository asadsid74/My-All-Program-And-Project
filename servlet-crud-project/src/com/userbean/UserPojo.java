package com.userbean;

public class UserPojo {
	private int Id;

	
	private String S_name;
	private String S_address;
	//private String S_password;
	private String S_mono;
	private String S_salary;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getS_name() {
		return S_name;
	}
	public void setS_name(String s_name) {
		S_name = s_name;
	}
	public String getS_address() {
		return S_address;
	}
	public void setS_address(String s_address) {
		S_address = s_address;
	}

	/*
	 * public String getS_password() { return S_password; } public void
	 * setS_password(String s_password) { S_password = s_password; }
	 */
	public String getS_mono() {
		return S_mono;
	}
	public void setS_mono(String s_mono) {
		S_mono = s_mono;
	}
	public String getS_salary() {
		return S_salary;
	}
	public void setS_salary(String s_salary) {
		S_salary = s_salary;
	}


}
