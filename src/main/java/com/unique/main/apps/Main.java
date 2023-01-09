package com.unique.main.apps;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.unique.main.Library;
import com.unique.main.Student;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Student s1 = new Student();
		s1.setName("Seth Dharamraj");
		s1.setCity("Banda");
		
		
		Library l1 = new Library();
		l1.setB_name("C++ by markov");
		
		s1.setLib(l1);
		l1.setStud(s1);
		
		em.persist(s1);

		System.out.println("Added");
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
