package com.springcore.autowire;

public class Address {

	private String address;
	private String street;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [address=" + address + ", street=" + street + "]";
	}
	
}
