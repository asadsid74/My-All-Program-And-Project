package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.Dao.StudentDao;
import com.spring.jdbc.entities.Management;

public class App {
	public static void main(String[] args) {
System.out.println("start..............");
ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
StudentDao st= context.getBean("stddao",StudentDao.class);
 
Management mn=new Management();
mn.setId(129);
mn.setName("Sahil");
mn.setState("kp");
mn.setAddress("baghnagar");
int t = st.insert(mn);
System.out.println("insert record"+t);
	}
}
