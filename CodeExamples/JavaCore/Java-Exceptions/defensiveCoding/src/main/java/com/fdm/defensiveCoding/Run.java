package com.fdm.defensiveCoding;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Run {

	static Logger log = Logger.getLogger(Run.class);

	public static void main(String [] a){
		BasicConfigurator.configure();
		divisionByZero();
		casting();
	}

	public static void divisionByZero(){
		com.fdm.defensiveCoding.undefensive.DivisionByZero udbz = 
				new com.fdm.defensiveCoding.undefensive.DivisionByZero();
		com.fdm.defensiveCoding.defensive.DivisionByZero ddbz = 
				new com.fdm.defensiveCoding.defensive.DivisionByZero();
		log.info("Divide by Zero");
		log.info("Undefensive:");
		try{
			udbz.execute();
		} catch (ArithmeticException e){
			log.fatal(e);
		}
		log.info("Defensive:");
		ddbz.execute();
		log.info("---------");
	}
	public static void casting(){
		log.info("Casting");
		log.info("undefensive");
		com.fdm.defensiveCoding.undefensive.CastingIssue uci = 
				new com.fdm.defensiveCoding.undefensive.CastingIssue();
		com.fdm.defensiveCoding.defensive.CastingIssue dci = 
				new com.fdm.defensiveCoding.defensive.CastingIssue();
		Object obj = new com.fdm.defensiveCoding.undefensive.DivisionByZero();
		try{
			uci.execute(obj);
		} catch(ClassCastException e){
			log.fatal(e);
		}
		log.info("defensive");
		dci.execute(obj);
		log.info("---------");
	}

}
