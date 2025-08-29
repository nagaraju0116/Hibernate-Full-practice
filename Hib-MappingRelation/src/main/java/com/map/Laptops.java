package com.map;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Laptops {
	@Id
	private int lid;
	private String lname;
	/* @ManyToOne */
	//many laptops are belonged to one student.
	//by this mapping done in Laptop table don't need Student_Laptop table and also need to mention in Student at @OneToMany (mappedBy="student") to not to create Student_Laptop 
	@ManyToMany
	private List<Student> student =new ArrayList<Student>();
	//private Student student;
	
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}
}
