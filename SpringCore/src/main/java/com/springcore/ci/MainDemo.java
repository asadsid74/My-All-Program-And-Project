package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {
public static void main(String[] args) {
	System.out.println("working in progress.......................");
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
	 Person pers=(Person) context.getBean("person");
	 
	 System.out.println(pers);
	
	
}
}
