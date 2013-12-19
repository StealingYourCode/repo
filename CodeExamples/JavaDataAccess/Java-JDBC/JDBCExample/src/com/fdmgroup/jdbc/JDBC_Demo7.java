/*
 * This version demonstrates using properties files to
 * generate the sql statement.
 * It uses reflection to call setter methods on the User class.
 * When the user class changes, the properties file will need to be changed too. 
 * However, this class will not have to be altered, it will still be able
 * to create a User object, populated with data from the DB. 
 */
package com.fdmgroup.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.lang.reflect.*;


public class JDBC_Demo7 
{

	// For loading properties from file
	Properties properties;
	String url, username, password;
	
	// For connecting to the database
	Connection conn;

	
	public JDBC_Demo7()
	{	
		properties = PropertiesLoader.getProperties("real.properties");
	
		if (properties != null) {			
			url = properties.getProperty("url");
			username = properties.getProperty("username");
			password = properties.getProperty("password");			
		}
	}
	
	public String getQuery(String queryName)
	{
		Properties qproperties = PropertiesLoader.getProperties("query.properties");
		String query = "";
		
		if (qproperties != null)			
			query = qproperties.getProperty(queryName);			
		
		return query;
	}
		
	//Returns the number of properties in the user class, 
	//as specified in the user.properties file
	public int getUserFields()
	{
		Properties qproperties = PropertiesLoader.getProperties("user.properties");
		int numFields = 0;
		
		if (qproperties != null)			
			numFields = Integer.parseInt(qproperties.getProperty("total"));			
		
		return numFields;
	}
	
	//Returns the name of the nth property
	public String getProperty(int num)
	{
		Properties qproperties = PropertiesLoader.getProperties("user.properties");
		String property = "";
		
		if (qproperties != null)			
			property = qproperties.getProperty("property"+num);			
		
		return property;
	}
	
	//Returns the type of the nth property
		public String getType(int num)
		{
			Properties qproperties = PropertiesLoader.getProperties("user.properties");
			String type = "";
			
			if (qproperties != null)			
				type = qproperties.getProperty("type"+num);			
			
			return type;
		}
	
	public User readUser(int id)
	{
		try 
		{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			conn = DriverManager.getConnection(url,username,password);
					
			String query = getQuery("readUser");
			
			// Get a PreparedStatement object	       	        			     
	        PreparedStatement statement = conn.prepareStatement(query);	        	       
	        statement.setInt(1, id);
	        
        	// Get a ResultSet from executing SELECT query
	        ResultSet rs = statement.executeQuery();
			
	        rs.next(); 
	        
	        int numFields = getUserFields();     

	        Class<?> userClass = Class.forName("com.fdmgroup.jdbc.User");
	        Object user = userClass.newInstance();
			Class<?> params[] = new Class[1];
	        Object[] arguments = new Object[1];
	        
	        for (int i=1; i<=numFields; i++)
	        {	  
	        	if ((getType(i)).equals("String")){
					params[0] = String.class; //set parameter type to string
					arguments[0] = rs.getString(getProperty(i)); //set argument					
	        	}
	        	else if ((getType(i)).equals("int")){
					params[0] = int.class; //set parameter type to string
					arguments[0] = rs.getInt(getProperty(i)); //set argument					
	        	}
	        	Method method = userClass.getDeclaredMethod("set"+getProperty(i),params);    					
				method.invoke(user, arguments);
	        }
	     
	        return (User)user;	        	        
	        
		} 
		catch (SQLException sqle) 
		{
			sqle.printStackTrace(); 
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{		   
			// Close the connection
		    if(conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	
		return null;
	}
	
	
	
	public static void main(String[] args) {
		
		JDBC_Demo7 demo = new JDBC_Demo7();
		User user = demo.readUser(2);
		System.out.println("User id: "+user.getId());
		System.out.println("User first name: "+user.getFirst_name());
		System.out.println("User last name: "+user.getLast_name());
		System.out.println("User age: "+user.getAge());

	}
}
