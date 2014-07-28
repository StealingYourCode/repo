package com.fdmgroup.exceptions.throwing;

public class Circle {
	
    private final double radius;
    
    public Circle(double radius) throws BadArgException {  
      
    	if (radius < 0.0) {
        	
        	// what to do when the arg is bad
        	throw new BadArgException("Radius " + radius
				    + " cannot be negative");
				
        }
        else
        	this.radius = radius;
    }
   
}