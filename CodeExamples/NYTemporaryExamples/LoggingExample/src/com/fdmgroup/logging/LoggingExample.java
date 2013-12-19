package com.fdmgroup.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggingExample {
	
	
	private static Logger log = 
			Logger.getLogger(LoggingExample.class);
	
	
	public LoggingExample(){
		
		PropertyConfigurator.configure("log4j.properties");

	}

	public void thisMethodWillLog(){

		log.trace("We just entered a method.");

		log.debug("We are debugging.");
		
		log.info("Some info.");
		
		log.warn("Warning. Errors ahead.");
		
		log.error("Terrible error.");
		
		log.fatal("This error is even worse.");
		
	}
	
	
	public static void main(String[] args){
		
		LoggingExample anInstance = 
				new LoggingExample();
		
		anInstance.thisMethodWillLog();
		
	}
	
}