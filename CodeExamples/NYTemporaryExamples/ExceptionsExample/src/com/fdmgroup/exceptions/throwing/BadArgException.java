package com.fdmgroup.exceptions.throwing;


public class BadArgException extends Exception {
	
	BadArgException(){
		super("Argument is bad.");
	}
	
	BadArgException(String message){
		super(message);
	}
}