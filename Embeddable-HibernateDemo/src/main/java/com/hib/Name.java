package com.hib;

import jakarta.persistence.Embeddable;

@Embeddable
public class Name {
	
	private String firstname;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) { 
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	@Override
	public String toString() {
		return "Name [firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname + "]";
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	private String middlename;
	private String lastname;
	

}
