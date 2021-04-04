package com.mapping1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapping1Demo {

	public static void main(String[] args) {

		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.setEid(101);
		e1.setEmpName("shahid khan");
		e2.setEid(201);
		e2.setEmpName("majid chaudhary");

		Project p1 = new Project();
		Project p2 = new Project();
		p1.setPid(501);
		p1.setProjectName("Ecommerce");
		p2.setPid(601);
		p2.setProjectName("FeeStructure");
		
		List<Employee> list1=new ArrayList<Employee>();
		List<Project> list2=new ArrayList<Project>();
		list1.add(e1);
		list1.add(e2);
		list2.add(p1);
		list2.add(p2);
		e1.setProjects(list2);
		p2.setEmployees(list1);
		
		s.save(e1);
		s.save(e2);
		s.save(p1);
		s.save(p2);

		
		t.commit();
		s.close();
		sf.close();
	}
}
