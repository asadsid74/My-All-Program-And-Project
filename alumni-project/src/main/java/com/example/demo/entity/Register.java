package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Register implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String mo_no;
	
	private String userName;
	
	private String password;
	
	private String address;

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

	public String getMo_no() {
		return mo_no;
	}

	public void setMo_no(String mo_no) {
		this.mo_no = mo_no;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Register(int id, String name, String mo_no, String userName, String password, String address) {
		super();
		this.id = id;
		this.name = name;
		this.mo_no = mo_no;
		this.userName = userName;
		this.password = password;
		this.address = address;
	}

	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", name=" + name + ", mo_no=" + mo_no + ", userName=" + userName + ", password="
				+ password + ", address=" + address + "]";
	}

	
	
}