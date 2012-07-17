package com.fdmgroup.anonymous;

public class EnclosingClass {

	public void publish(){
		System.out.println("Enclosing class");
	}
	
	public static class StaticInnerClass{
		public void myMethod(){
			System.out.println("Static inner class");
		}
	}
	
	public class InstanceClass{
		public void myMethod(){
			System.out.println("Instance class");
		}
	}
}