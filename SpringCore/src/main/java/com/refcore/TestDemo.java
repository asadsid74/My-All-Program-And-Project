package com.refcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
	public static void main(String[] args) {
		System.out.println("working.....................progress");
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("com/refcore/refconfig.xml"); A a = (A)
		 * context.getBean("aref"); System.out.println(a.getX());
		 * System.out.println(a.getOb());
		 */
		BeanFactory bfc= new ClassPathXmlApplicationContext("com/refcore/refconfig.xml");
		A a=(A) bfc.getBean("aref");
		System.out.println(a);

	}
}
