package com.fdmgroup.loggingexample;

import org.apache.log4j.Logger;


public class LoggingExample {

	Logger log;
			
	String username;
	

	public LoggingExample(String username)
	{
		this.username = username;
	}
	
	public LoggingExample(){

		log = Logger.getLogger(username);

	}
	
	public void go(){ 

		log.trace("We just entered a method.");

		log.debug("We are debugging.");
		
		log.info("Some info.");
		
		log.warn("Warning. Errors ahead.");
		
		log.error("Terrible error.");
		
		log.fatal("This error is even worse.");
	}
	
	public static void main(String[] args) {
	
		new LoggingExample("Samir").go();
		new LoggingExample("Feng").go();
		new LoggingExample("Tatyana").go();

		
	}
	
}
