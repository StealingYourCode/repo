package com.fdmgroup.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Properties properties = null;
		
		FileInputStream fileIS = null;
				
		try {
			properties = new Properties();
			fileIS = new FileInputStream("Demo.properties");	
			properties.load(fileIS);
			fileIS.close();
		}
		catch(IOException ioe) {
			properties = null;
			ioe.printStackTrace();
		}
			
		if (properties != null){
			System.out.println("Retrieving greeting by name: " + properties.getProperty("greeting"));
			System.out.println("Retrieving departure by name: " + properties.getProperty("departure"));

			
			System.out.println("Properties via a loop");
			for (String key: properties.stringPropertyNames())
			{
				System.out.println("Retrieving " + key + " : " + properties.getProperty(key));
			}
			
			System.out.println("This key does not exist: Whatever = " + properties.getProperty("Whatever"));
			System.out.println("This key does not exist, using default value: Whatever = " + properties.getProperty("Whatever", "not Really"));
			System.out.println("Retrieving departure by name: " + properties.getProperty("departure","DEFAULT DEPARTURE"));
			
			System.out.println("Adding numbers: " + (Integer.parseInt(properties.getProperty("number1"))+ Integer.parseInt(properties.getProperty("number2"))));
			
		}

		try {
			FileOutputStream fileOS = new FileOutputStream("Demo.xml");	
			properties.storeToXML(fileOS, "New Properties file");
			fileOS.close();
		}
		catch(IOException ioe) {
			properties = null;
			ioe.printStackTrace();
		}

	}

}
