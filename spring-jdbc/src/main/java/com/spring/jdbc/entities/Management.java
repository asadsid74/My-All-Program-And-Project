package com.spring.jdbc.entities;

public class Management {
private int id;
private String name;
private String State;
private String Address;
@Override
public String toString() {
	return "Management [id=" + id + ", name=" + name + ", State=" + State + ", Address=" + Address + "]";
}
public Management(int id, String name, String state, String address) {
	super();
	this.id = id;
	this.name = name;
	State = state;
	Address = address;
}
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
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public Management() {
	super();
	
}
}

