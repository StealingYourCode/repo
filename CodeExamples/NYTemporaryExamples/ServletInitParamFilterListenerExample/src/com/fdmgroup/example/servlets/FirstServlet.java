package com.fdmgroup.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       

    public FirstServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/* Accessing Context init parameters */
		ServletContext servletContext = getServletContext();
		
		System.out.println(
				servletContext.getInitParameter("admin_email")
				);
		
		System.out.println(
				servletContext.getInitParameter("company")
				);

		/* Accessing Servlet init parameters */
		ServletConfig servletConfig = getServletConfig();
		
		System.out.println("This is servlet number... "
					+ servletConfig.getInitParameter("servlet_number"));
		
		/* Accessing a request parameter attached by the Filter */
		
		System.out.println("This request got a "
		+ request.getAttribute("welcomeItem"));
		
		
		PrintWriter out = response.getWriter();
		out.print("Next page!");
	
	}

}









