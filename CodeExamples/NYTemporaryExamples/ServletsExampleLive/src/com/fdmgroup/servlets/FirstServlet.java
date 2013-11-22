package com.fdmgroup.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		// Get init parameters using ServletConfig object.
		
		// Get a ServletConfig object
		// Represents this Servlet's configuration
		ServletConfig servConfig = getServletConfig();
		
		Double randomtom= Double.parseDouble("3.1415");
		Double randomjerry= Double.parseDouble("3141.5");
		
		request.setAttribute("randomtom", randomtom);
		request.setAttribute("randomjerry", randomjerry);
		
		
		Pizza myLunch = new Pizza();
		
		request.setAttribute("lunchPizza", myLunch);
		
		
		
		
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("mousehunt.jsp");
		rd.forward(request, response);
		

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("http://www.bing.com/");
		
	}

}
