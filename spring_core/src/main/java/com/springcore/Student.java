package com.springcore;

public class Student {
     private int studentId;
     private String studentName;
     private String studenAddress;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("setting id");
		this.studentId = studentId;
	}
	public String getStudentName() {
		
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("setting name");
		this.studentName = studentName;
	}
	public String getStudenAddress() {
		
		return studenAddress;
	}
	public void setStudenAddress(String studenAddress) {
		System.out.println("setting Address");
		this.studenAddress = studenAddress;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", "
				+ "studentName=" + studentName + ","
						+ " studenAddress=" + 
				                studenAddress
				                 + "]";
	}
	
}
