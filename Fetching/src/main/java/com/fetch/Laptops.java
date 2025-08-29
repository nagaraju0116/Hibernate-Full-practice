package com.fetch;

import jakarta.persistence.*;

@Entity
public class Laptops {
	@Id
	private int Lid;
	private String Lname;
	private int price;
	@ManyToOne
	private Alien alien;
	public Alien getAlien() {
		return alien;
	}
	public void setAlien(Alien alien) {
		this.alien = alien;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	@Override
	public String toString() {
		return "Laptop [Lid=" + Lid + ", Lname=" + Lname + ", price=" + price + "]";
	}

}
