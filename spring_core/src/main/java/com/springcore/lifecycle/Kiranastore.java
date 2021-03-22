package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Kiranastore implements InitializingBean, DisposableBean {
	private int sugar;

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		System.out.println(" seting sugar price");
		this.sugar = sugar;
	}

	@Override
	public String toString() {
		return "Kiranastore [sugar=" + sugar + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("taking suger : init");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("after suger : destroy");
	}

}
