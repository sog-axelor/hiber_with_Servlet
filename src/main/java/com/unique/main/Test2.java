package com.unique.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test2
 */
public class Test2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test2() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();//get the stream to write the data 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
	
		
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String Book = request.getParameter("book");	
		
		
		
		Library1 l1 = new Library1();
		l1.setB_name(Book);
		em.persist(l1);
		
		ArrayList<Library1> list = new ArrayList<Library1>();
		list.add(l1);
		
		Student1 s1 = new Student1();
		s1.setS_name(name);
		s1.setS_city(city);
		s1.setBook_issued(list);
		em.persist(s1);
		
	
		
		
		out.print("Added Successfully.....");
		em.getTransaction().commit();
		em.close();
		emf.close();
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
