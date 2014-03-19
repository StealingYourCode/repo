package com.fdmgroup.rentalexample;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class TestRental {

	@Test
	public void test() {

		/* Without Generics, a general Rental class */
		
		List<Object> initialPool = new ArrayList<Object>();
		
		initialPool.add(new Car());
		initialPool.add(new Car());
		initialPool.add(new Car());
		initialPool.add(new Car());
		
		Rental rental = new Rental(initialPool);
		
		Object myRental = rental.getOne();
		Car myCar = null;
		
		if(myRental instanceof Car)
			myCar = (Car) myRental;
		
		//if (myCar != null)
		//	myCar.drive();
		
		/* Without Generics, a specific rental class only for cars */
		
		List<Car> initialPoolofCars = new ArrayList<Car>();
		
		initialPoolofCars.add(new Car());
		initialPoolofCars.add(new Car());
		initialPoolofCars.add(new Car());
		initialPoolofCars.add(new Car());
		
		CarRental myCarRental = new CarRental(initialPoolofCars);
		
		Car mySecondCar = myCarRental.getOne();
		// mySecondCar.drive();
		
		
		/* With Generics, multi-purpose rental class */

		GenericRental<Car> genericCarRental = new GenericRental<Car>(initialPoolofCars);
		
		
		GenericRental<String> genericStringRental = new GenericRental<String>(new ArrayList<String>());
		
		genericStringRental.returnOne("hello");
		String rentalString = genericStringRental.getOne();
		
	}

}
