package com.map;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	private int marks;
	/*//for one student has one laptop
	 * @OneToOne 
	 * private Laptop laptop;
	 */
	//one student has many laptops and mappedBy used for not to make Student_Laptop table by laptop
	/* @OneToMany (mappedBy="student") */
	@ManyToMany (mappedBy="student")
	private List<Laptops> laptop =new ArrayList<Laptops>();
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	/*
	 * public Laptop getLaptop()
	 *  { 
	 *  return laptop;
	 *   } 
	 * public void setLaptop(Laptop
	 * laptop) { this.laptop = laptop; }
	 */
	public List<Laptops> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptops> laptop) {
		this.laptop = laptop;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	
}
