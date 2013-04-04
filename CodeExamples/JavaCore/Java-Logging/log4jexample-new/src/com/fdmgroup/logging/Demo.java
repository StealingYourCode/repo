package com.fdmgroup.logging;

import org.apache.log4j.Logger;

public class Demo {

	// Initiate a logger. Here, we the the root logger 
	// (sometimes ill-advised, better to use a specific logger)
	//static Logger rootLog = Logger.getRootLogger();
	
	// Or, get specific loggers to direct logging output
	// to well-defined locations
	
	// The programmer can send the bulk of logging output here
	static Logger programmerLog = Logger.getLogger("programmerLog");
	
	// If you really insist on seeing console output, use this for 
	// output that you don't mind not recording into a file
	static Logger consoleLog = Logger.getLogger("consoleLog");
	
	// Management and audit logs can go here
	static Logger managerLog = Logger.getLogger("managerLog");
	
	// From here on, log away! Methods are: log.info(...), 
	// log.warn(...), etc.
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("./log4j.properties");

		// These logging requests allow us to see the effect
		// of changing the severity level with which each logger
		// accepts messages. Try changing the severity level in 
		// the properties file to observe which logging requests 
		// are honored by the appenders they refer to.
		programmerLog.trace("programmer log: trace message");
		programmerLog.debug("programmer log: debug message");
		programmerLog.info("programmer log: info message");
		programmerLog.warn("programmer log: warn message");
		programmerLog.error("programmer log: error message");
		programmerLog.fatal("programmer log: fatal message");
		
		consoleLog.trace("console log: trace message");
		consoleLog.debug("console log: debug message");
		consoleLog.info("console log: info message");
		consoleLog.warn("console log: warn message");
		consoleLog.error("console log: error message");
		consoleLog.fatal("console log: fatal message");
		
		managerLog.trace("manager log: trace message");
		managerLog.debug("manager log: debug message");
		managerLog.info("manager log: info message");
		managerLog.warn("manager log: warn message");
		managerLog.error("manager log: error message");
		managerLog.fatal("manager log: fatal message");

	}

}
