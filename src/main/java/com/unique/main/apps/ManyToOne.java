package com.unique.main.apps;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.unique.main.Library2;
import com.unique.main.Student2;

public class ManyToOne {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Library2 l2 = new Library2();
		l2.setB_name("Computer Science");
		em.persist(l2);
		
		Student2 s2 = new Student2();
		s2.setSname("Seth Manikchand");
		s2.setScity("Navsari");
		s2.setLib(l2);
		em.persist(s2);
		System.out.println("Added");
		
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		
		
		
		
		
		System.out.println("Added");
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
