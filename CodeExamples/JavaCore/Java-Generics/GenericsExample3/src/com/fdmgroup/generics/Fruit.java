package com.fdmgroup.generics;

public abstract class Fruit extends Food
{
	String taste;

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	public abstract void prepare();
		
}
