package com.fdmgroup.generics;

public class SaladTime
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Apple apple = new Apple();
		Mango mango = new Mango();
		Pineapple pineapple = new Pineapple();

		FruitSalad fruitSalad = new FruitSalad();
		
		apple.prepare();
		mango.prepare();
		pineapple.prepare();
		
		fruitSalad.add(apple);
		fruitSalad.add(mango);
		fruitSalad.add(pineapple);
		
		fruitSalad.serve();
		fruitSalad.analyze();
		
	}
	
}


