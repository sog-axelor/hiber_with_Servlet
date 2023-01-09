package com.unique.main.apps;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.unique.main.Library1;
import com.unique.main.Student1;

public class OneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
	
		Library1 l1 = new Library1();
		l1.setB_name("Java with Web Application");
		em.persist(l1);
		
		ArrayList<Library1> list = new ArrayList<Library1>();
		list.add(l1);
		
		Student1 s1 = new Student1();
		s1.setS_name("Kevin Mehta");
		s1.setS_city("Gujrat");
		s1.setBook_issued(list);
		em.persist(s1);
		
		System.out.println("Added");
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
