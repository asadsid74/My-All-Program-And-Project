package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletConfig config= getServletConfig();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
			Class.forName(config.getInitParameter("driver"));
			Connection con=DriverManager.getConnection(config.getInitParameter("url"),
					config.getInitParameter("username"),config.getInitParameter("password"));
			PreparedStatement ps=con.prepareStatement("select * from user");
			out.print("<table border=2  width=40% height=40% align=center  bgcolor=green> ");
			out.print("<tr><th>id</th> <th>name</th><th>Address</th></tr> ");
			ResultSet rs =ps.executeQuery();
			while (rs.next()) {
				//out.print("<tr><td > </td></tr>");
				out.println("<tr><td>"+ rs.getInt(1)+"</td><td> "+rs.getString(2)+"</td><td> "+rs.getString(3)+" </td> </tr>");
				out.print("</table");
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
