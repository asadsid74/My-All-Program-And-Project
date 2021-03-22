package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
		System.out.println("working in progress...............................");
		AbstractApplicationContext ap = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lcconfig.xml");
		//Shopkeaper sk = (Shopkeaper) ap.getBean("skeper");
		//System.out.println(sk);]
		System.out.println("is it right");
		ap.registerShutdownHook();

		// Kiranastore kst = (Kiranastore) ap.getBean("kirana");
		//System.out.println("++++++++++++++++++++++++++++++++++++++");
		//System.out.println(kst);
		Examplee ex=(Examplee) ap.getBean("exm");
		System.out.println(ex);
	}

}
