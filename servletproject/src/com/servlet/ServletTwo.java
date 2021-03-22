package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTwo
 */
@WebServlet("/")
public class ServletTwo extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printwriter=response.getWriter();

		printwriter.print("<form action='ServletOne' method='post'>");
		

		printwriter .print("<table cellspan='2' cellpadding='2' width='70%' height='50%' border='2' align='center' bgcolor=blue>");
		printwriter.print("<tr><th colspan ='3' bgcolor='red' style=color:white> <i>Simple Validation User Login Form</i> ></th></tr>");
		printwriter.print("<tr><th> UserName: </th><th><input type='text' name='username'/></th></tr>");
		printwriter.print("<tr><th> Password: </th><th><input type='password' name='password'></th></tr>");
		printwriter.print("<tr><th> Confirm Password: </th><th><input type='password' name='confpassword'></th></tr>");
		printwriter.print("<tr><th colspan='2'align='center'><button type='submit'>save </button></th></tr>");

		printwriter.print("</table>");  
		printwriter.print("</form>");  
		}

		

}