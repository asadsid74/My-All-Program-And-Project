package com.springcore.collction;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private String name;
	private List<String> phone_no;
	private Set<String> address;
	private Map<String, String> courses;
	private String m;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(List<String> phone_no) {
		this.phone_no = phone_no;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "" + ", phone_no=" + phone_no + ", " + "address=" + address + ", courses="
				+ courses + "]";
	}

}
