
package com.daoimplement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.daointerface.Daointerface;
import com.dbconnect.DbConnection;
import com.userbean.UserPojo;

public class DaoImplementation implements  Daointerface{
	static Connection con=null;
	static PreparedStatement ps=null;
	 static Statement st=null;
	@Override
	public void crud(UserPojo up) {
		
		try {
			con=DbConnection.getconnection();
			ps=con.prepareStatement("insert into kld(S_name,S_address,S_mono,S_salary) values (?,?,?,?)");
			//ps.setInt(1,9);
			ps.setString(1, up.getS_name());
			ps.setString(2, up.getS_address());
			//ps.setString(3, up.getS_password());
			ps.setString(3,up.getS_mono());
			ps.setString(4, up.getS_salary());
			ps.executeUpdate();
		    con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public  List<UserPojo> fetch(){  
        List<UserPojo> list=new ArrayList<UserPojo>();  
          
        try{  
            Connection con=DbConnection.getconnection();  
            PreparedStatement ps=con.prepareStatement("select * from kld");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
            	UserPojo e=new UserPojo();  
            	e.setId(rs.getInt(1));
                e.setS_name(rs.getString(2));  
                e.setS_address(rs.getString(3));  
                e.setS_mono(rs.getString(4));  
                e.setS_salary(rs.getString(5));  
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;    
	}

}
