package com.hib;

import jakarta.persistence.*;

@Entity
public class Details {
	@Id
	private int id;
	private Name name;
	/* @Transient   -- used to remove column but not in embedded class related*/
	private String colour;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Details [id=" + id + ", name=" + name + ", colour=" + colour + "]";
	}
	

}
