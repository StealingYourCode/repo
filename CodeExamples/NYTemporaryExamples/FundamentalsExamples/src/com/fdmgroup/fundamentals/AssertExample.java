package com.fdmgroup.fundamentals;


public class AssertExample {
	
	public static void main(String[] args){
		
		int myFive = 5;
		
		// absolutely must be a five here
		
		// evil code
		myFive = 4;
		
		assert(myFive == 5);
		
		System.out.println("Life is good.");
		
	}
	
}
