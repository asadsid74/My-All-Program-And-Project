package com.hqlpagination;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class HqlPagination {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String f_name;
	private String l_name;
	private  String address;
	private String state;
	private String pincode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "HqlPagination [id=" + id + ", f_name=" + f_name + ", l_name=" + l_name + ", address=" + address
				+ ", state=" + state + ", pincode=" + pincode + "]";
	}
	
}
