package com.fdmgroup.fundamentals;


class Person {
	
	String name;
}

class Trainee extends Person {
	String stream;
}














public class OverloadingOverriding {

	public static void main(String[] args) {
		
		Animal a = new Dog();
		//a.breathe();
		Dog d = new Dog();
		//d.breathe();
	}
	
}

class Animal {
	

	public Object breathe(){
		System.out.println("Animal breathing");
		return null;
	}
	
}


class Dog extends Animal {

	@Override
	public Object breathe(){
		
		System.out.println("Breathing like a dog");
		return null;
	}
}	




	











