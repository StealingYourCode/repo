package com.fdmgroup.example;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.rentals.CarRental;
import com.fdmgroup.rentals.GenericRental;
import com.fdmgroup.rentals.Rental;

public class TestRental {

	static List			preGenericPool;
	static List<Car>	genericPool;

	@BeforeClass
	public static void setup() {

		preGenericPool = new ArrayList();

		preGenericPool.add(new Car());
		preGenericPool.add(new Car());
		preGenericPool.add(new Car());
		preGenericPool.add(new Car());

		genericPool = new ArrayList<Car>();

		genericPool.add(new Car());
		genericPool.add(new Car());
		genericPool.add(new Car());

	}

	@Test
	public void demoRental() {

		Rental rental = new Rental(preGenericPool);

		Object rentalObject = rental.getOne();
		Car myCar = null;

		if (rentalObject instanceof Car)
			myCar = (Car) rentalObject;

		rental.returnOne(myCar);

	}

	@Test
	public void demoCarRental() {

		CarRental carRental = new CarRental(preGenericPool);

		Car myCar = carRental.getOne();
		carRental.returnOne(myCar);

	}

	@Test
	public void demoGenericRental() {

		GenericRental<Car> genericCarRental = new GenericRental<Car>(genericPool);

		Car myCar = genericCarRental.getOne();
		genericCarRental.returnOne(myCar);
	}

}
