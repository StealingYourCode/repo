package com.fdmgroup.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SecondServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		System.out.println("LOG! Entered SecondServlet...");

		String name = request.getParameter("user_name");

		List<String> days = null;
		Object object = request.getAttribute("gym_days");
		if (object instanceof List) {
			days = (List<String>)object;
		}

		PrintWriter out = response.getWriter();

		out.println("<!doctype html>");
		out.println("<html><body>");
		out.println("<h2>Hello " + name + ", Welcome to our "
				+ "first Servlet-generated page!</h2>");
		out.println("<h3>This is exciting!</h3>");
		
		if (days != null)
			for(String day : days)
					out.println(day+"<br/>");
		
		out.println("</body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
