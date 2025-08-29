package com.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {

	public static void main(String[] args) {
		
		Name name =new Name();
		name.setFirstname("Katam");
		name.setMiddlename("Naga");
		name.setLastname("Raju");
		
		Details details = new Details();
		details.setId(1);
		details.setName(name);
		details.setColour("blue");
		SessionFactory sessionfactory =new Configuration().addAnnotatedClass(com.hib.Details.class).configure().buildSessionFactory();
		//ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		
		Session session=sessionfactory.openSession();
		
		Transaction transaction =session.beginTransaction();
		session.persist(details);
		transaction.commit();
		
		
	}

}
