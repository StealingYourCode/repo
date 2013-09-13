package com.fdmgroup.reflection;

import java.util.Properties;

import com.fdmgroup.apples.*;

public class ReflectionExample {

	public static void main(String[] args){
		
		Properties properties = 
				PropertiesLoader.getProperties("my.properties");
		
		
		if (properties != null){
			System.out.println(
					properties.getProperty("some") +
					properties.getProperty("fake") +
					properties.getProperty("properties")
					
					);
			
			System.out.println(properties.getProperty("variety"));
		}
		
		
		Apple myApple = null;
		
		try {
		
			Class myClass = Class.forName("com.fdmgroup.apples."+
					properties.getProperty("variety")+"Apple");
			myApple = (Apple) myClass.newInstance();
			
			
			
			
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(myApple != null)
			myApple.doAppleThings();
		
		
	}
}
