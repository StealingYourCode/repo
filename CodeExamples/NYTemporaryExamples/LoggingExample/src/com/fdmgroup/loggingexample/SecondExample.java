package com.fdmgroup.loggingexample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class SecondExample {
	
	// Instantiates and retrieves a Logger called 
	// "SecondExample.class" 
	static Logger log = 
			Logger.getLogger("LoggingExample.NumberTwo");
	

	public static void go(){
		
		log.error("Error #1!");
		log.fatal("Fatal Error #1!");
		log.error("Error #2!");
		
		
		
	}
}
