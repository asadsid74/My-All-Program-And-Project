package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapingDemo {
	public static void main(String[] args) {

		Configuration conf = new Configuration();
		// System.out.println("hii");
		conf.configure("hibernate.cfg.xml");
		// System.out.println("bye");

		SessionFactory sf = conf.buildSessionFactory();

		Question q = new Question();
		q.setQ_id(3);
		q.setQuestionTYpe("what is interface");

		/*
		 * Question q1=new Question();
		 * 
		 * q1.setQ_id(2); q1.setQuestionTYpe("what is class"); Question q2=new
		 * Question(); q2.setQ_id(3); q2.setQuestionTYpe("what is inheritance");
		 * 
		 */

//		Answer an = new Answer();
//		an.setA_id(10);
//		an.setAns("interface is just like a class");
//		
		Answer an1 = new Answer();

		an1.setAns("interface is just like a class ");
		an1.setQuid(q);

		Answer an2 = new Answer();

		an2.setAns("interfcae contain only abstract method");
		an2.setQuid(q);

		Answer an3 = new Answer();

		an3.setAns("does not any constructer of an interface but hava abstract class ");
		an3.setQuid(q);

		List<Answer> list = new ArrayList<Answer>();
		list.add(an1);
		list.add(an2);
		list.add(an3);

		q.setAnswers(list);
		/*
		 * an1.setQuid(q1); an2.setQuid(q2); q.setAns_id(an);
		 * 
		 * q1.setAns_id(an1); q2.setAns_id(an2); an.setQuid(q);
		 * 
		 * 
		 * an1.setQuid(q1); an2.setQuid(q2);
		 */
		Session scs = sf.openSession();
		Transaction tx = scs.beginTransaction();
		scs.save(q);
//		scs.save(q1);
//		scs.save(q2);
		scs.save(an1);
		scs.save(an2);
		scs.save(an3);

		// Question qt=scs.load(Question.class , 1);

		/*
		 * System.out.println(qt.getQ_id()); for (Answer answ : qt.getAnswers()) {
		 * System.out.println(answ.getAns());
		 * 
		 * }
		 */

		tx.commit();
//		Question sd = scs.get(Question.class, 2);
//		System.out.println(sd.getQuestionTYpe());
//		// System.out.println(sd.getAns_id().getAns());

		scs.close();
		sf.close();

	}

}
