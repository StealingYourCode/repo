package com.fdmgroup.exceptions.throwing;


public class BadArgException extends Exception {
	
	
	public double getTheArg(){
		return 0.0;
	}
	
	BadArgException(){
		super("Argument is bad.");
	}
	
	BadArgException(String message){
		super(message);
	}
}