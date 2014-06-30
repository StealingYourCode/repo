package com.fdmgroup.exceptions;

public class Circle {
    private final double radius;
    
    public Circle(double radius) throws BadArgException {  
        if (radius < 0.0) {
        	
        	// what to do if bad arg
        	throw new BadArgException("Radius " + radius
				    + " cannot be negative");
				
        }
        else
        	this.radius = radius;
    }
   
}

class BadArgException extends Exception {
	
	BadArgException(){
		super("Argument is bad.");
	}
	
	BadArgException(String message){
		super(message);
	}
}