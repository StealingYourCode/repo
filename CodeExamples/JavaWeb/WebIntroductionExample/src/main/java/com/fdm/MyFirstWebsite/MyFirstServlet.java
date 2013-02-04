package com.fdm.MyFirstWebsite;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws IOException,
			ServletException{
		User user = new User("Kevin", "Timmins");
		req.setAttribute("user", user);
		RequestDispatcher rd = req.getRequestDispatcher("./WEB-INF/helloUser.jsp");
		rd.forward(req, resp);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		User user = new User(firstname, lastname);
		req.setAttribute("user", user);
		RequestDispatcher rd = req.getRequestDispatcher("./WEB-INF/helloUser.jsp");
		rd.forward(req, resp);
	}
}
