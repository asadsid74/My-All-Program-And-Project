package com.hqlpagination;

import java.util.List;

import org.hibernate.Query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hql.Manager;

public class HqlDemo {

	public static void main(String[] args) {
		
	Configuration con= new Configuration();
	
	con.configure("hibernate.cfg.xml");
	//con.addAnnotatedClass(HqlPagination.class);
	SessionFactory sf=con.buildSessionFactory();
	Session s=sf.openSession();
Transaction t=s.beginTransaction();
		/*
		 * HqlPagination hqlp=new HqlPagination();
		 * 
		 * hqlp.setId(2); hqlp.setF_name("shamshad"); hqlp.setL_name("khan");
		 * hqlp.setAddress("karnatak"); hqlp.setState("jharkhand");
		 * hqlp.setPincode("400332");
		 */
		 
	Query q=s.createQuery("from HqlPagination");
	q.setFirstResult(1);
	q.setMaxResults(4);
	List<HqlPagination> list=q.list();
	for (HqlPagination mana : list) {
	System.out.println(mana.getId());
	System.out.println(mana.getF_name());
	System.out.println(mana.getL_name());
	System.out.println(mana.getAddress());
	System.out.println(mana.getState());
	
	}
		/* s.save(hqlp); */
	t.commit();
	s.close();
	sf.close();
	}
	
}
