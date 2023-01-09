package com.unique.main;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private int id;
	private String name,city;
	
	@OneToOne(targetEntity = Library.class,cascade = CascadeType.ALL)
	private Library lib;
	
	public int getId() {
		return id;
	}


	public Library getLib() {
		return lib;
	}


	public void setLib(Library lib) {
		this.lib = lib;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}



	
	
}
