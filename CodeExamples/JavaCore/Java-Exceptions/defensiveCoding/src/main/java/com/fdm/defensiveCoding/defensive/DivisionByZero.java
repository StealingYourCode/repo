package com.fdm.defensiveCoding.defensive;

import org.apache.log4j.Logger;

public class DivisionByZero {

	Logger log = Logger.getLogger(DivisionByZero.class);
	
	public void execute(){
		int a = 8;
		int b = 0;
		if(b==0){
			log.info("Just stopped from throwing an unchecked exception");
		} else {
			int c = a/b;
		}
	}
	
}
