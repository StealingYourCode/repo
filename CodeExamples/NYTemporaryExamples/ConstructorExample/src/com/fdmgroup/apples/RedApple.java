package com.fdmgroup.apples;

public class RedApple extends Apple {

	
	
	public RedApple(String color, String taste){

		super(color,taste);  
		
		System.out.println("RedApple ARG Constructor");
	}

	public RedApple() {
		
		this("red","pretty good");
		
		System.out.println("RedApple NO-ARG Constructor");
		
	}
	
	
}
