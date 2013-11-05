package com.fdmgroup.jdbc;

import java.util.Properties;


public class PropertiesDemo {


	public static void main(String[] args) {

		Properties props = 
				PropertiesLoader.getProperties("my.properties");
		
		System.out.println(
				props.getProperty("password")
				);

	}

}
