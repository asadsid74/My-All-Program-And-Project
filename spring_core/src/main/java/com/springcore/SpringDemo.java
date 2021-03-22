package com.springcore;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		System.out.println("hello we are using SpringCore");
		
		ApplicationContext  context=new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student) context.getBean("Student1");
		Student student1=(Student) context.getBean("Student2");
		System.out.println(student);
		System.out.println(student1);
	}

} 
