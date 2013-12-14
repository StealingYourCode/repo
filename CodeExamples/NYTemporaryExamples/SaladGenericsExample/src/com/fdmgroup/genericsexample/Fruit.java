package com.fdmgroup.genericsexample;

abstract class Food { } 

public abstract class Fruit extends Food { 
	
	String taste;
	
	public String getTaste() {
		return taste;
	}
	
	public void setTaste(String taste){
		this.taste = taste;
	}
	
	public abstract void prepare();
	
}


class Apple extends Fruit {
	
	public void prepare(){
		System.out.println("Apple is washed, peeled, and chopped.");
	}
}

class Mango extends Fruit {
	
	public void prepare(){
		System.out.println("Mango is diced.");
	}
}

class Pineapple extends Fruit {
	
	public void prepare(){
		System.out.println("Can of pineapple is opened.");
	}
}