package com.fdm.WebAppWithFilter;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		if(request.getAttribute("message") == null){
			request.setAttribute("message", "Hello Kevin");
		}
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/hello.jsp");
		rd.forward(request, response);
	}

}
