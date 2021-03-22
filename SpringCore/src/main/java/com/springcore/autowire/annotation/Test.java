package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	@Autowired
	private Emp emp;
	@Autowired
	private Address address;
	public void m()
	{
		 
		address.setStreet("Sakimaka");
		address.setAddress("Mumbai");
		emp.setAddress(address);
	}
	
	public static void main(String[] args) {
		System.out.println("working .............");
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/config.xml");
		Test t=new Test();
		t.m();
		
	//	Emp emp =context.getBean("emp1",Emp.class);
		//System.out.println(emp);
	}
}
