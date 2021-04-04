package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class InsertDemo 
{
    public static void main( String[] args )
    {
    	Configuration cn=new Configuration();
    	cn.configure("hibernate.cfg.xml");
    	cn.addAnnotatedClass(I_UserBean.class);
    	
    	SessionFactory sf= cn.buildSessionFactory();
    	Session scs=sf.openSession();
    	System.out.println(sf);
    	System.out.println(sf.isClosed());
    	Transaction tr=scs.beginTransaction();
    	I_UserBean ub=new I_UserBean();
    	ub.setId(79);
    	ub.setName(" Ahmad "); 
    	ub.setAddress("gkp");
    	ub.setMo_no("09876654");
    	scs.save(ub);
    	tr.commit();
    	
    	
    	
    	
    	
        System.out.println( "Hello World!" );
    }
}
