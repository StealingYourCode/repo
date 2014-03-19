package com.fdmgroup.rentalexample;

import java.util.List;


public class CarRental {
	
	// Pool of objects
	private List<Car> pool;
	
	public CarRental(List<Car> pool){
		this.pool = pool;
	}
	
	public Car getOne(){
		
		if(pool == null)
			return null;
		
		if(pool.isEmpty())
			return null;
		
		return pool.remove(0);
	}
	
	public void returnOne(Car returnItem){
		pool.add(returnItem);
	}
	
}


