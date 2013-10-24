package com.fdmgroup.exceptions;

public class Circle {
    private final double radius;
    
    /**
    * Constructor.
    * @param radius the radius of the circle.
    * @throws IllegalArgumentException if radius is negative.
    */
    public Circle(double radius) {  // runtime exception is not declared
        if (radius < 0.0) {
            // defensive coding here
        	// what to do if bad arg
        	try {
        		
				throw new BadArgException("Radius " + radius
				    + " cannot be negative");
				
			} catch (BadArgException e) {
				e.printStackTrace();
				// what to do if bad arg
			}
        }
        
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