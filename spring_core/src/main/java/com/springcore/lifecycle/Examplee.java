package com.springcore.lifecycle;

public class Examplee {

	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Examplee [subject=" + subject + "]";
	}
	
	public void start() {
		System.out.println("method is starting......");
	}
	
	public void end() {
		System.out.println("method is ending.....");
	}
}
