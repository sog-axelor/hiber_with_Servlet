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

/**
 * Servlet implementation class Test1
 */
public class Test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test1() {
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
		
		//out.print(name);
		
//		Student s1 = new Student();
//		s1.setName(name);
//		s1.setCity(city);
//		
//		
//		Library l1 = new Library();
//		l1.setB_name(Book);
//		
//		s1.setLib(l1);
//		l1.setStud(s1);
//		
//		em.persist(s1);
		
//		Student s = em.find(Student.class,21);
//		em.remove(s);
//		
//		out.print("Deleted Successfully.....");
//		em.getTransaction().commit();
//		em.close();
//		emf.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
