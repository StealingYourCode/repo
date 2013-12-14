package com.fdmgroup.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggingExample {

	
	// Instantiates and retrieves a Logger called 
	// "LoggingExample.class" 
	static Logger log = 
			Logger.getLogger(LoggingExample.class);
	
	LoggingExample(){
		
		PropertyConfigurator.configure("log4j.properties");
	}

	
	public static void main(String[] args) {
	
		log.trace("Entered main method...");
		
		log.debug("Debug message!");
		
		log.debug("Check if everything is okay");
		
		log.info("Continuing with main execution");		
		
		log.warn("Warning! Something might be wrongs");
	
		log.error("Hello error");
		
		log.fatal("Everything died");

		
		
//		Object[] objArray = new Object[2];
//
//		if (objArray[1] != null)
//			objArray[1].toString();	
//		else
//			log.error("Null reference here..");
//		
//		int i = 17;
//		
//		if (i < objArray.length)
//			objArray[17].toString();
//		else
//			log.error("Array index out of bounds");
//		
//		
//		try {
//			
//			objArray[17].toString();
//		}
//		catch(Exception e){
//			log.error(e);
//			log.error("message",e);
//		}
		
	}

}
