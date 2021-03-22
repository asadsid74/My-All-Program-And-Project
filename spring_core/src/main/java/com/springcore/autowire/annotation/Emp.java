
package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Emp {

	@Autowired
	//@Qualifier("address3")
	private Address address;

	public Address getAddress() {
		return address;
	}

	public Emp() {
		super();
		 
	}
	
	public void setAddress(Address address) {
		
		this.address = address;
		//System.out.println("setting values ...........");
	}
	
	public Emp(Address address) {
		super();
		System.out.println("sting....");
		this.address = address;

	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
