package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class Main {

	public static void main(String[] args) {
		Laptops laptop =new Laptops();
		laptop.setLid(104);
		laptop.setLname("lenovos");
		
		Student student = new Student();
		student.setRollno(2);
		student.setName("lokis");
		student.setMarks(700);
		//student.setLaptop(laptop);
		//getLaptop()  which gives u arrayList of Laptop and add () takes obj.
		student.getLaptop().add(laptop);
		laptop.getStudent().add(student);
		SessionFactory sessionfactory =new Configuration()
				.addAnnotatedClass(com.map.Student.class)
				.addAnnotatedClass(com.map.Laptops.class)
				.configure()
				.buildSessionFactory();
		
		
		Session session=sessionfactory.openSession();
		
		Transaction transaction =session.beginTransaction();
		session.persist(student);
		session.persist(laptop);
		transaction.commit();
	}

}
/*
 * use nagdb;
 * 
 * show tables; 
 * drop table student_laptop;
 *  drop table student; 
 *  drop table laptop; 
 *  drop table laptop_student;
 * 
 * select * from student;
 *  select * from laptop; 
 *  select * from student_laptop;
 *  select * from laptop_student;
 */