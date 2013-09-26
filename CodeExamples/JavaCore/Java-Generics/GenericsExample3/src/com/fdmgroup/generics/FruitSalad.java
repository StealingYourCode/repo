package com.fdmgroup.generics;

import java.util.ArrayList;

public class FruitSalad implements iSalad<Fruit> 
{
	private ArrayList<Fruit> ingredients = new ArrayList<Fruit>();
		
	@Override
	public ArrayList<Fruit> serve() 
	{
		System.out.println("Our salad has "+ingredients.size()+" ingredients in it.");
		return ingredients;
	}

	@Override
	public void add(Fruit food) 
	{
		ingredients.add(food);		
	}
	
	public void analyze()
	{
		for (Fruit fruit : ingredients)
		{
			System.out.println("This fruit is a: "+fruit.toString());
		}		
	}
}
