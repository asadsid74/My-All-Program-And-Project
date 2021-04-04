package com.hql;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HqlExample {

	public static void main(String[] args) {
		
		Configuration con=new  Configuration();
		con.configure("hibernate.cfg.xml");
		//con.addAnnotatedClass(Manager.class);
		SessionFactory sf= con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t= s.beginTransaction();
		/*
		 * Manager m=new Manager(); m.setManager_id(200); m.setManager_name("khalid");
		 * m.setManager_address("kurla"); m.setManager_salary("300");
		 */
		  String query="from Manager  where manager_name= 'kunal'";
		  Query q=s.createQuery(query); 
		//q.setParameter("x", "khalid");
		  List<Manager>list=q.list();
		  for (Manager man: list)
		  {
		  System.out.println(man.getManager_name()+"  :"+ man.getManager_id());
		  
		  }
		  //delete from Manager;
		  System.out.println("______________________________________________________________");
		  Query q1=s.createQuery(" delete from Manager where manager_name='rajputr'");
		 int r=q1.executeUpdate();
		  System.out.println("deleted successfully...............");
		 System.out.println(r);
		  
		 // update manager;
		 Query q2=s.createQuery("update Manager set manager_address='jabalpur' where manager_address='kanpur'");
		 int r1=q2.executeUpdate();
		 System.out.println("updated successfully...................");
		 System.out.println(r1);
		
		
		
		
		t.commit();
		s.close();
		sf.close();
	}
}
