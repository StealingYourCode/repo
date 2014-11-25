package com.fdmgroup.servletdemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		
		doGet(request,response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// Form Parameters / Request Parameters
		String name = request.getParameter("user_name");

		System.out.println("LOG! " + name + " has entered our website.");

		
		
		if (name.equals("goat"))
			response.sendRedirect("http://www.google.com/search?q=goats");
		
		else {
			
			// Here, let's attach an attribute to the request
			List<String> days = new ArrayList<String>();
			
			days.add("Monday");
			days.add("Wednesday");
			days.add("Sunday"); 
			
			request.setAttribute("gym_days", days);

			
			Trainee currentTrainee = new Trainee();
			HttpSession session = request.getSession();
			session.setAttribute("currentTrainee", currentTrainee);
			
			
			
			Trainee adminTrainee = new Trainee();
			getServletContext().setAttribute("admin", adminTrainee);
			
			System.out.println(
					"Email issues to "+
					getServletContext().getInitParameter("admin_email"));
			
			
			
			RequestDispatcher reqDispatcher = 
					request.getRequestDispatcher("page_one");
			
			reqDispatcher.forward(request, response);
			
		}
	}

}
