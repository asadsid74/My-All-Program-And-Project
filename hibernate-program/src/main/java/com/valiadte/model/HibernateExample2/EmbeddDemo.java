package com.valiadte.model.HibernateExample2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddDemo {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		Configuration cg=cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		
		Student st = new Student();
		st.setId(101);
		st.setName("altamas");
		st.setAddress("sion");

		Certificate cer = new Certificate();
		cer.setCourse("MCA");
		cer.setDuration("3 year");
		st.setCerti(cer);

		/*
		 * Student st1 = new Student(); st1.setId(1009); st1.setName("sakib");
		 * st1.setAddress("kamani");
		 * 
		 * Certificate cer1 = new Certificate(); cer1.setCourse("java");
		 * cer1.setDuration("3 month");
		 */

		/* st1.setCerti(cer1); */
		Session sc = sf.openSession();
		Transaction t = sc.beginTransaction();


		
		sc.save(st);
		//sc.save(st1);
		sc.close();
		t.commit();
		sf.close();
		
		
	}

}
