package com.fetch;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fetch.Laptops;
import com.fetch.Alien;

public class Main {

	public static void main(String[] args) {

		
		/*
		 * Laptops laptopes =new Laptops(); laptopes.setLid(204);
		 * laptopes.setLname("lenovo223");
		 * 
		 * Alien alien = new Alien(); alien.setId(112); alien.setName("smokiser");
		 */
		
		//getLaptop()  which gives u arrayList of Laptop and add () takes obj.
	//	alien.getLaps().add(laptopes);
		
		SessionFactory sessionfactory =new Configuration()
				.addAnnotatedClass(com.fetch.Alien.class)
				.addAnnotatedClass(com.fetch.Laptops.class)
				.configure()
				.buildSessionFactory();
		
		
		Session session=sessionfactory.openSession();
		
		Transaction transaction =session.beginTransaction();
		session.beginTransaction();
		/*
		 * session.persist(alien); session.persist(laptopes);
		 * 
		 * transaction.commit();
		 */
		
		Alien a1 = session.byId(Alien.class).load(11);
			 // Alien a1 =session.find(Alien.class, 11);
			  
			  
			  
				/*
				 * Collection<Laptops> laps = a1.getLaps(); System.out.println(laps);
				 * for(Laptops l : laps) { System.out.println(l); }
				 * session.getTransaction().commit();
				 */
			 

	}

}
