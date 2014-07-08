package com.fdmgroup.rentals;

import java.util.List;

import com.fdmgroup.example.Car;


public class CarRental {
	
	// Pool of objects
	private List pool;
	
	public CarRental(List pool){
		this.pool = pool;
	}
	
	public Car getOne(){
		
		if(pool == null)
			return null;
		
		if(pool.isEmpty())
			return null;
		
		Object temp = pool.remove(0);
		if(temp instanceof Car)
			return (Car)temp;
		else
			return null;
	}
	
	public void returnOne(Car returnItem){
		pool.add(returnItem);
	}
}
