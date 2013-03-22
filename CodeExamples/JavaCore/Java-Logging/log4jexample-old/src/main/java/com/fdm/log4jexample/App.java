package com.fdm.log4jexample;

import org.apache.log4j.*;

public class App 
{
	
	public static Logger log = Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	PropertyConfigurator.configure("src/main/resources/log4j.properties");
        log.trace("Trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
        log.fatal("fatal");
    }
}
