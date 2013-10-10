package com.fdmgroup.fundamentals;


public class VarArgsExample {
	
	public static void go(int x){
		System.out.println("int method");
	}
	
	public static void go(Object x){
		System.out.println("Object method");
	}
		
	public static void go(String x){
		System.out.println("Single String method");
	}


	public static void go(String ... x){
		System.out.println("Var-arg String method");
	}

	 public static void go(String y, String ... x){  
		 System.out.println("It works");
	 }
	 
	 
	//public static void go(String ... x, int y){}
	
	
	public static void main(String[] args){

	//	go(5);
		
//		go("hi");
//		
//		go("hi","hello");
		
	}
	
}