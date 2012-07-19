package com.fdm.springCoreIntro;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static Logger log = Logger.getLogger(Main.class);
	
	public static void main(String [] a){
		BasicConfigurator.configure();
		log.warn("Initialised the logger");
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	}
	
}
