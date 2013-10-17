package com.fdmgroup.java.designpatterns;

class MySingleton {

	private static MySingleton instance = new MySingleton();

	private MySingleton(){

	}
	
	public static MySingleton getInstance(){
		
		return instance;
	}
	
	public int veryImportantMethod(){
		return 0;
	}
	
	public String anotherVeryImportantMethod(){
		return "some text";
	}	
}





















