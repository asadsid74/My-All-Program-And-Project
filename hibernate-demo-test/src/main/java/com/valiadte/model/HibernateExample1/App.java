package com.valiadte.model.HibernateExample1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration con=new Configuration();
    	con.configure("hibernate.cfg.xml");
    	con.addAnnotatedClass(Bean.class);
    	
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tr=session.beginTransaction();
    	Bean bean=new Bean();
    	bean.setId(101);
    	bean.setName("asad");
    	bean.setPassword("1234");
    	bean.setCity("pune");
    	session.save(bean);
    	tr.commit();
       
    }
}
