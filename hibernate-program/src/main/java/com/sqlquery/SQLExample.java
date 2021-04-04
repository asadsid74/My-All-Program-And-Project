package com.sqlquery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class SQLExample {
 
	public static void main(String[] args) {
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		
		String qu= "from Isolution";
		Query q=s.createQuery(qu);
	
		List<Isolution> list=q.list();
		for (Isolution iso: list) {
			
			System.out.println(iso.getId()+" : "+iso.getName()+" : "
			+iso.getAddress()+": "+iso.getCity());
		}
		//s.save(list);
		s.close();
		sf.close();

	}
}

