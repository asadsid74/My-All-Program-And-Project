package com.springcore.collction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
		System.out.println("it working...................");
		
		ApplicationContext context=new 
				ClassPathXmlApplicationContext("com/springcore/collction/collectconfig.xml");
		Student stud =(Student) context.getBean("Student1");
		System.out.println(stud.getName());
		System.out.println(stud.getPhone_no());
		System.out.println(stud.getAddress());
		System.out.println(stud.getCourses()); 
		System.out.println(stud.getPhone_no().getClass().getName());
	
	}

}
