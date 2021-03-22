package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daoimplement.DaoImplementation;
import com.daointerface.Daointerface;
import com.userbean.UserPojo;

/**
 * Servlet implementation class Requestpage
 */
@WebServlet("/Requestpage")
public class Requestpage extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String ss=request.getParameter(id)
		String s=request.getParameter("S_name");
		String s1=request.getParameter("S_address");
	//	String s2=request.getParameter("S_password");
		String s3=request.getParameter("S_mono");
		String s4=request.getParameter("S_salary");
		System.out.println(s+" "+s1+" "+s3+" "+s4);
		 UserPojo up=new  UserPojo();
		 
		 up.setS_name(s);
	
		 up.setS_address(s1);
		//up.setS_password(s2);
	    up.setS_mono(s3);
		up.setS_salary(s4);
		Daointerface daoin=new DaoImplementation();
		daoin.crud(up);
		response.sendRedirect("index.jsp");
	
		
	}

}
