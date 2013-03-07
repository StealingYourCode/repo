package com.fdmgroup.sampleKata;

import org.apache.log4j.Logger;

public class SampleClass {

	Logger log = Logger.getLogger(SampleClass.class);
	
	public boolean example(){
		log.info("SampleClass example() method invoked");
		return true;
	}
	
}
