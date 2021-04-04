package com.crud;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class I_UserBean {
	@Id 
	private int id;
	private String name;
	private String address;
	private String mo_no;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMo_no() {
		return mo_no;
	}
	public void setMo_no(String mo_no) {
		this.mo_no = mo_no;
	}
	

}
