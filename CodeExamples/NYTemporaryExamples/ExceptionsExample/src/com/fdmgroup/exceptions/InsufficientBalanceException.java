package com.fdmgroup.exceptions;


public class InsufficientBalanceException extends Exception {
    
	private final double available;
    private final double required;

    
    public InsufficientBalanceException(double available, double required) {
        
    	super("Available $"+available+" but required $"+required);
       
    	this.available = available;
        this.required = required;
    }

    public double getAvailable() {
        return available;
    }

    public double getRequired() {
        return required;
    }

    public double getDifference() {
        return required - available;
    }
}