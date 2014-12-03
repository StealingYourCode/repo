package com.fdmgroup.apples;

public class Apple {
	
	String color;
	String taste;

	public Apple(String color, String taste){

		this.color = color;
		this.taste = taste;
		
		System.out.println("Apple ARG Constructor");
	}

	public Apple() {
		
		this("apple-colored","like an apple");
		
		System.out.println("Apple NO-ARG Constructor");	
	}
}
