package com.fdmgroup.java.designpatterns;

class MySingleton {

	private static MySingleton instance;

	private MySingleton(){	}
	
	public static MySingleton getInstance(){
		
		if(instance == null)
			instance = new MySingleton();
		
		return instance;
	}
	
	public int veryImportantMethod(){
		return 0;
	}
	
	public String anotherVeryImportantMethod(){
		return "some text";
	}	
}

class RunThings {
	
	public static void main(String[] args){
		MySingleton.getInstance().anotherVeryImportantMethod();
	}
}





















