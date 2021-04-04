package com.jstl;

public class Test {

	public static Test factoryMethod() {
		return new Test();
		
	}
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println(Class.forName("com.jstl.Test"));
	}

}
