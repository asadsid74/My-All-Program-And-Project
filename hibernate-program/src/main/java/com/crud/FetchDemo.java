package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(F_Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session scs = sf.openSession();
		
		F_Employee f=new F_Employee();
		f.setName("G");
		f.setPassword("GG");
		f.setCity("Mumbai");
		Transaction tx = scs.beginTransaction();
		
		
		//scs.save(f);
		tx.commit();
		F_Employee q = scs.get(F_Employee.class, 1);
		System.out.println(q);
		//scs.close();
		Session currentSession = sf.getCurrentSession();
		Transaction tx1 = currentSession.beginTransaction();
		tx1.commit();
		F_Employee q1 = currentSession.get(F_Employee.class, 2);
		System.out.println(q1);
		
		

	}
}
