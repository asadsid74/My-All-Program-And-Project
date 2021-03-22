package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.Daoiinterface;
import com.Daoimpl.Daoimplmt;
import com.Pojo.bean;

/**
 * Servlet implementation class Requestpage
 */
@WebServlet("/Requestpage")
public class Requestpage extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		bean bb=new bean();
		bb.setName(request.getParameter("Name"));
		Daoiinterface dd=new Daoimplmt();
		dd.Deletevalue(bb);
		response.sendRedirect("index.jsp");
			
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String s=request.getParameter("Name");
		String s1=request.getParameter("MO_no");
		String s2=request.getParameter("Address");
		System.out.println(s+" "+ s1+" "+s2);
		bean b=new bean();
	b.setName(s);
	b.setMO_no(s1);
	b.setAddress(s2);
		Daoiinterface daon=new Daoimplmt();
				
		String button = request.getParameter("submit");
				//System.out.println(uname+pwd+email+contact+age);
		if(button.equals("save")){
			daon.show(b);
			response.sendRedirect("index.jsp");
			}
			
			
			else if(button.equals("update")){
				
				b.setAddress(request.getParameter("Address"));
				System.out.println(button);
				System.out.println("hii");
			
				daon.UpdateValues(b);
				
				}
				response.sendRedirect("index.jsp");
				//RequestDispatcher rd=request.getRequestDispatcher("index.jsp");  
	
				//rd.include(request, response);
				//rd.forward(request, response);
	}
	
	
	
	

}
