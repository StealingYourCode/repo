package com.fdmgroup.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		User user4 = new User();
		
		user1.setUsername("Konstantin");
		user1.setPassword("prof");
		
		user2.setUsername("Adam");
		user2.setPassword("chopstick");
		
		user3.setUsername("Damina");
		user3.setPassword("grilledreef");
		
		user4.setUsername("Pippa");
		user4.setPassword("accountmanagement");
		
		List<User> userList = new ArrayList<User>();
		
		userList.add(user1);
		userList.add(user2);	
		userList.add(user3);
		userList.add(user4);
		
		request.setAttribute("myList", userList);
		
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		rd.forward(request, response);
		
	}

}

















