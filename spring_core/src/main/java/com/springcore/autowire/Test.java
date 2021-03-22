package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("working .............");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/autowireconfig.xml");
		Emp emp = (Emp) context.getBean("emp1");
		System.out.println(emp);

	}
}
