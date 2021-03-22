package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

/**
 * Servlet implementation class ServletOne
 */
@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		java.sql.Connection con = null;
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		String confpassword = request.getParameter("confpassword");
		System.out.println("username.." + username + "password..  " + password + " confirm_password.. " + confpassword);
		if (username== null || username.trim().length() ==0) {
			out.print("enter username");
			

		}
		if (password == null || password.trim().length() == 0) {
			out.print("enter password");
			
		}
		if (confpassword == null || confpassword.trim().length() == 0) {
			out.print("please! enter confirm password");
			
		}
		if (password.equals(confpassword)) {
			out.print("password not matched ");
			try {

				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
				PreparedStatement str = con
						.prepareStatement("insert into student(username,password,confpassword)values(?,?,?)");

				str.setString(1, username);
				str.setString(2, password);
				str.setString(3, confpassword);
				int i = str.executeUpdate();
				if (i > 0) {

					// request.setAttribute("error", "successfully -");

					request.getRequestDispatcher("/").forward(request, response);

					out.print("succesfully register");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			out.print("both pass should be same");
		}
	}
}
