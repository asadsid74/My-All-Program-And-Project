package com.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mapping.Answer;
import com.mapping.Question;
import com.valiadte.model.HibernateExample2.Student;

public class FirstLevelCache {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
     configuration.addAnnotatedClass(InsertDEmo.class);
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		InsertDEmo idmo=new InsertDEmo("101", "belal","khan","kurla east","98383838734");
		InsertDEmo idmo1=new InsertDEmo("103", "lala","chaudhary","kurla west","98383838734");
		InsertDEmo idmo2=new InsertDEmo("105", "halal","khan","jari mari","983838734");
		InsertDEmo st=session.get(InsertDEmo.class , "103"); System.out.println(st);
		
		
		 
		session.save(idmo);
		session.save(idmo1);
	session.save(idmo2);
		transaction.commit();
		
		
	session.close();
	
	}
}
