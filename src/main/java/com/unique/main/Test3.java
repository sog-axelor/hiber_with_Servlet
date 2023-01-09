package com.unique.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Test3() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();//get the stream to write the data 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String Book = request.getParameter("book");	
		
		Library2 l1 = new Library2();
		l1.setB_name(Book);
		em.persist(l1);
		
		Student2 st2 = new Student2();
		st2.setSname(name);
		st2.setScity(city);
		st2.setLib(l1);
		
		em.persist(st2);
		
		
		out.print("Added Successfully.....");
		em.getTransaction().commit();
		em.close();
		emf.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
