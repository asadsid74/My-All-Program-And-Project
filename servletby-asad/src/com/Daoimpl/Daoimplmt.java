  package com.Daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Connection.Dbconnection;
import com.Dao.Daoiinterface;
import com.Pojo.bean;


public class Daoimplmt implements Daoiinterface {
	Connection con=null;
	PreparedStatement ps=null;
	@Override
	public void show(bean b) {
		 
		System.out.println(b);
		
		try {
			con=Dbconnection.getConnection();
			
		 ps=con.prepareStatement("insert into jktech values(?,?,?)");
		 ps.setString(1, b.getName());
		 ps.setString(2, b.getMO_no());
		 ps.setString(3, b.getAddress());
		 ps.executeUpdate();
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public List<bean> GetAlldata() {
		List<bean> list=new ArrayList<bean>();
		try {
			con=Dbconnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select* from jktech");
			while (rs.next()) {
				bean b=new bean();
				b.setName(rs.getString(1));
				b.setMO_no(rs.getString(2));
				b.setAddress(rs.getString(3));
				list.add(b);
				
				
			}
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	
	}
	@Override
	public void UpdateValues(bean b) {
		// TODO Auto-generated method stub
		
		
			Connection con=null;
			PreparedStatement ps=null;
			try {
				con=Dbconnection.getConnection();
				
			ps=con.prepareStatement("update jktech set Name =?,MO_no=? where Address=?");
			ps.setString(1, b.getName());
				ps.setString(2, b.getMO_no());
				ps.setString(3,b.getAddress());
			ps.executeUpdate();
			
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	@Override
	public void Deletevalue(bean b) {
		// TODO Auto-generated method stub
		 Connection con=null;
		 PreparedStatement st=null;
		 try {
			 con=Dbconnection.getConnection();
			 st=con.prepareStatement("delete from jktech where Name=?");
			st.setString(1, b.getName());
			 st.executeUpdate();
			 
			 System.out.println(st);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		}
	}
	