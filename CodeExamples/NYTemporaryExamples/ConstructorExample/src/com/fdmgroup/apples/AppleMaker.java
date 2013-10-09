package com.fdmgroup.apples;

/** A class for making Apples. */
public class AppleMaker {

	public static void main(String[] args) {
		
		// What will be the output from this line of code?
		Apple myLunchApple = new FujiApple();
		
		
		System.out.println("Color: " + myLunchApple.color);
		System.out.println("Taste: " + myLunchApple.taste);
	}

}
