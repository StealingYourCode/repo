package com.fdm.defensiveCoding.defensive;

import org.apache.log4j.Logger;

public class CastingIssue {

	Logger log = Logger.getLogger(CastingIssue.class);
	
	public void execute(Object obj){
		if(obj instanceof String){
			String msg = (String)obj;
		} else {
			log.info("Just stopped casting a none String into a String");
		}
	}
	
}
