package com.fdmgroup.food;

import java.util.ArrayList;
import java.util.List;

/**
 * A class representing a chicken sandwich.
 * 
 * @author tatyana.tsymbalenko
 * @version 1.1
 *
 */
public class ChickenSandwich {

	public String chicken;
	public String lettuce;
	public String tomato;
	
	public List<String> piecesOfBread;
	public List<String> condiments;
	
	public boolean spoiled;
	
	private int calories;

	
	/**
	 * No argument constructor.
	 */
	public ChickenSandwich() {
		
		this("some chicken", "some lettuce", 
				"some tomato");

	}
	
	/**
	 * Constructor specifying the main ingredients.
	 * 
	 * @param chicken the chicken
	 * @param lettuce the lettuce
	 * @param tomato the tomato
	 */
	public ChickenSandwich(String chicken, String lettuce, 
			String tomato){
		
		this.chicken = chicken;
		this.lettuce = lettuce;
		this.tomato = tomato;
		
		piecesOfBread = new ArrayList<String>();
		piecesOfBread.add("first piece");
		piecesOfBread.add("second piece");
		
		condiments = new ArrayList<String>();	
		spoiled = false;
		calories = 500;
	}
	
	
	/**
	 * Adds all specified condiments to condiment list.
	 * 
	 * @param condiments the condiments to add
	 */
	public void prepare(ArrayList<String> condiments) {
		
		this.condiments.addAll(condiments);
	}
	

	/**
	 * Returns the number of calories in this chicken sandwich.
	 * 
	 * @return  the number of calories
	 * @deprecated
	 */
	public int getCalories() {
		
		return calories;
	}

	
	/**
	 * Removes the tomato.
	 * 
	 * @throws ChickenSandwichException
	 * @see ChickenSandwichException
	 */
	public void removeTomato() throws ChickenSandwichException {
		
		if (tomato == null)
			throw new ChickenSandwichException();
		
		tomato = null;
		
	}
	
}


class ChickenSandwichException extends Exception {
	
}