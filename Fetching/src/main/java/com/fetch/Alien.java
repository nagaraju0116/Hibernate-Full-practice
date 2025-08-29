package com.fetch;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.*;

@Entity
public class Alien {
	
	@Id
	private int Id;
	private String name;
	@OneToMany(mappedBy="alien",fetch=FetchType.EAGER)//by using fetch eager gets left join Laptops quickly and by default it is lazy
	private Collection<Laptops> laps = new ArrayList<Laptops>();
	public Collection<Laptops> getLaps() {
		return laps;
	}
	public void setLaps(Collection<Laptops> laps) {
		this.laps = laps;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Alien [Id=" + Id + ", name=" + name + "]";
	}
	

}
