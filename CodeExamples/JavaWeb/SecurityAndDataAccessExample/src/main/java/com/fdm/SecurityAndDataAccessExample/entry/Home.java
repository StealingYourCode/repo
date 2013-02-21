package com.fdm.SecurityAndDataAccessExample.entry;

import java.io.IOException;
import java.security.Principal;
import java.sql.*;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.DataSource;

public class Home extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		/*
		 * The principal is populated by tomcat, and the name coincides with the username.
		 */
		HttpSession session = request.getSession();
		Principal p = request.getUserPrincipal();
		if(request.isUserInRole("user")){
			session.setAttribute("isUser", true);
		}
		String username = p.getName();
		String query = "SELECT address FROM example_users WHERE username = '"+username+"'";
		/*
		 * This next section deals with getting the Data Source from the context.
		 */
		InitialContext context;
		DataSource dataSource = null;
		try {
			context = new InitialContext();
			//This is a bit of JNDI - we don't need to know how this works, just that it does.
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/connection");
		} catch (NamingException e) {
			e.printStackTrace();
		}
		Connection connection;
		ResultSet rset = null;
		try {
			connection = dataSource.getConnection();
			Statement stmt = connection.createStatement();
			rset = stmt.executeQuery(query);
			while(rset.next()){
				session.setAttribute("address", rset.getString("address"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/protectedPage.jsp");
		rd.forward(request, response);
	}
}