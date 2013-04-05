package com.fdm.InnerClasses;

public class OuterClass {

	private void printMessage1(){
		System.out.println("Message 1");
	}
	
	private class InnerClass{
		public void printMessage(){
			printMessage1();
			System.out.println("Inner class: Message 2");
		}
	}
	
	
}
