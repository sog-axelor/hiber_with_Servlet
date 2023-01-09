package com.unique.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;	

@Entity
public class Library {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int b_id;
	private String b_name;
	
	@OneToOne(targetEntity = Student.class)
	private Student stud;

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}
	
	
}
