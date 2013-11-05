package com.fdmgroup.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseStorageExample {

	// For loading properties from file
	Properties properties;
	String url, username, password;
	
	// For connecting to the database
	Connection conn;

	
	public DatabaseStorageExample(){
	
		properties = PropertiesLoader.getProperties("my.properties");
	
		if (properties != null) {
			
			url = properties.getProperty("url");
			username = properties.getProperty("username");
			password = properties.getProperty("password");
			
		}
	}
	
	
	public void printAllRecordsInTable(){	
		
		try {
			
			
			
			// First, make sure the driver jar is in your build path 
			
			DriverManager.registerDriver(
					new oracle.jdbc.driver.OracleDriver());
	        
			
			
			// Get a connection object -- this could fail!
			
			conn = DriverManager.getConnection(url,username,password);
		    
			
			
			
			// Get a statement object
	        
			PreparedStatement statement = conn.prepareStatement(
					"SELECT FIRSTONE,SECONDONE FROM MYNEWTABLE WHERE FIRSTONE=?" +
					" AND SECONDONE=?");
	       
	        statement.setString(1, "hi");
	        statement.setString(2, "Green");
	          
	        
	        //String query = "SELECT FIRSTONE,SECONDONE FROM MYNEWTABLE";
	        
	        
	        // Statement:
	        // ResultSet rs = statement.executeQuery(query);
	        
	        // Get a ResultSet from executing SELECT query
	        ResultSet rs = statement.executeQuery();
	        
	        
	     
	        
	        // Must call rs.next() to get first row! 
	        // While loop gets this done
	        
	        while(rs.next()) {
	        	
	        	System.out.println(	
	        			
        			rs.getString("firstone")+" "+
        			rs.getString("secondone")
					
        			);

	        }
	        
	        
	        
		} catch (SQLException sqle) {
			sqle.printStackTrace(); 
		}
		finally {
		    
			// Close the connection
		    if(conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
	}
	
	
	public static void main(String[] args){
		new DatabaseStorageExample().printAllRecordsInTable();
	}
}




