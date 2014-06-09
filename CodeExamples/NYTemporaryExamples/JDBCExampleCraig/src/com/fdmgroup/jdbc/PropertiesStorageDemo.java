package com.fdmgroup.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesStorageDemo {

	public static Properties getProperties(String filename) {

		Properties properties = null;
		FileInputStream fileIS = null;

		try {
			properties = new Properties();
			fileIS = new FileInputStream(filename);
			properties.load(fileIS);
			fileIS.close();
		} catch (IOException ioe) {
			properties = null;
			ioe.printStackTrace();
		}

		return properties;
	}

	public static void main(String[] args) {

		Properties p = PropertiesStorageDemo.getProperties("fake.properties");

		String type = p.getProperty("Type");

		Class<?> classToLoad;

		try {
			Scanner kb = new Scanner(System.in);
			System.out.println("Waiting");
			kb.nextLine();
			classToLoad = Class
					.forName("com.fdmgroup.jdbc." + type + "storage");
			Storage item = (Storage) classToLoad.newInstance();
			item.accessStorage();

			Storage item2 = (Storage) classToLoad.newInstance();
			item2.accessStorage();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
