package com.unique.main;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String sname,scity;
	
	@ManyToOne(targetEntity =Library2.class, cascade = CascadeType.ALL)
	private Library2 lib;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	public Library2 getLib() {
		return lib;
	}

	public void setLib(Library2 lib) {
		this.lib = lib;
	}


	
	
	
	
	
}
