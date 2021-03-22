package com.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DbConnection {

	public static Connection getconnection() {
		Connection con=null;
		
		try {
			Class.forName("com.cj.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	

}
