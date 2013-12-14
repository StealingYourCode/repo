package com.fdmgroup.genericsexample;

import java.util.List;

// All salads
// Salads mean food
public interface ISalad<T extends Food> {
	
	// add item
	public void add(T t); 
	
	// serve salad
	public List<T> serve();
}
