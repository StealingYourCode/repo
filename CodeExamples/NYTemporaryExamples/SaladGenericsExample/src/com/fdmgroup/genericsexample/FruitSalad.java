package com.fdmgroup.genericsexample;

import java.util.ArrayList;
import java.util.List;


public class FruitSalad implements ISalad<Fruit> {

	List<Fruit> ourSalad = new ArrayList<Fruit>();
	
	@Override
	public void add(Fruit t) {

		ourSalad.add(t);
		
	}

	@Override
	public List<Fruit> serve() {

		return ourSalad;
	}
	
	public void analyze()
	{
		for (Fruit fruit : ourSalad )
			System.out.println("This fruit is a: "+ 
						fruit.getClass().getSimpleName());
	}
	
}
