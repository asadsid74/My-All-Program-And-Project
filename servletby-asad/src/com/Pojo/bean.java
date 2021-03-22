package com.Pojo;

public class bean {

	private String Name;
	private String MO_no;
	private String Address;
	@Override
	public String toString() {
		return "bean [Name=" + Name + ", MO_no=" + MO_no + ", Address=" + Address + "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMO_no() {
		return MO_no;
	}
	public void setMO_no(String mO_no) {
		MO_no = mO_no;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
