package com.fdmgroup.live;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggingExampleLive {
	
	
	static Logger log = 
			Logger.getLogger(LoggingExampleLive.class);			
	
	LoggingExampleLive(){
		
		PropertyConfigurator.configure("log4j.properties");

	}
	
	
	public void thisMethodWillLog()
	{

		log.trace("We just entered a method.");
		
		log.info("Some info.");
	
		log.warn("Warning. Errors ahead.");
	
		log.error("Terrible error.");
		
		log.fatal("This error is even worse.");
		
	}
	
	public void logsWithDefensiveCoding()
	{
		Object[] objArray = new Object[2];

	    if (objArray[1] != null)
	    	objArray[1].toString();   
	    else
	        log.error("Null reference here..");
	      
	    int i = 17;
	       
	    if (i < objArray.length)
	        objArray[17].toString();
	    else
	        log.error("Array index out of bounds");
	       
	    try {
	        objArray[17].toString();
	    }
	    catch(Exception e){
	        log.error(e);
	        log.error("message",e);
	    }

	}
	
	public static void main(String[] args){
		
		LoggingExampleLive LE_live = 
				new LoggingExampleLive();
		
		LE_live.thisMethodWillLog();
		//LE_live.logsWithDefensiveCoding();
		
	}
	
}
