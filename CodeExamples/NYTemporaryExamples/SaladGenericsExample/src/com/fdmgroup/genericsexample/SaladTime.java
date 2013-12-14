package com.fdmgroup.genericsexample;


public class SaladTime {

	public static void main(String[] args) {

		Apple apple = new Apple();
		Mango mango = new Mango();
		Pineapple pineapple = new Pineapple();
		
		// FruitSalad fruitSalad = new FruitSalad();
		Salad<Fruit> fruitSalad = new Salad<Fruit>();
		
		apple.prepare();
		mango.prepare();
		pineapple.prepare();

		fruitSalad.add(apple);
		fruitSalad.add(mango);
		fruitSalad.add(pineapple);
		
		fruitSalad.serve();
		//fruitSalad.analyze();
		
		// Can also do this:
		
		//Salad<Fruit> otherFruitSalad = new Salad<Fruit>();
		

	}

}
