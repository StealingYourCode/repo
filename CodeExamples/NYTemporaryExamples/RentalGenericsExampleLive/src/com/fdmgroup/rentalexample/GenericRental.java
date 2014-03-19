package com.fdmgroup.rentalexample;

import java.util.List;


public class GenericRental<T> {

	private List<T> pool;
	
	public GenericRental(List<T> pool){
		this.pool = pool;
	}
	
	public T getOne(){
		
		if(pool == null)
			return null;
		
		if(pool.isEmpty())
			return null;
		
		return pool.remove(0);
	}
	
	public void returnOne(T returnItem){
		pool.add(returnItem);
	}
}
