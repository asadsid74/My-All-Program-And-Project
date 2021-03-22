package com.springcore.lifecycle;

public class Shopkeaper {
	private int rinPrice;

	public int getRinPrice() {
		return rinPrice;
	}

	public void setRinPrice(int rinPrice) {
		System.out.println("setting price");
		this.rinPrice = rinPrice;
	}

	@Override
	public String toString() {
		return "Shopkeaper [rinPrice=" + rinPrice + "]";
	}

	public void initmethod() {
		System.out.println("i m init method");
	}

	public void destroymethod() {
		System.out.println("i m destroy method");
	}

}
