package com.fdmgroup.jdbc;

import java.util.HashMap;
import java.util.Properties;

public class EagerLoadingExample {

	public static void main(String[] args) {
		
		HashMap<String,Storage> hm = new HashMap<String,Storage>();
		
		hm.put("RAM", new RAMstorage());
		hm.put("DB", new DBstorage());

		// Load the Properties file into an Object
		Properties p = PropertiesStorageDemo.getProperties("fake.properties");

		// Get the type from the properties file
		String  type = p.getProperty("Type");

		// get the Storage instance from the Map
		Storage item = hm.get(type);
		
		// use Storage
		item.accessStorage();
	}

}
