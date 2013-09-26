package xml.test;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import xml.example.Car;
import xml.example.CarXMLStorage;

public class TestCarXMLStorage {
	CarXMLStorage cxs = new CarXMLStorage();
	ArrayList<Car> alCar;
	
	@Ignore
	public void testAddNewCar() {
		Car mockCar = mock(Car.class);
		CarXMLStorage cxs = new CarXMLStorage();
		
		when(mockCar.getCarId()).thenReturn(10);
		when(mockCar.getMake()).thenReturn("Craig");
		when(mockCar.getModel()).thenReturn("Newman");
		
		cxs.create(mockCar);
		
		verify(mockCar).getCarId();
		verify(mockCar).getMake();
		verify(mockCar).getModel();
	}

	public void reset()
	{
		alCar = new ArrayList<Car>();
		
		File xmlFile = new File("Cars.xml");
		xmlFile.delete();
		
		Car[] c = {new Car(1,"Ford", "Model T"),
					new Car(2, "Ford", "Mustang"),
					new Car(3, "Dodge", "Caravan"),
					new Car(4, "Dodge", "Charger"),
					new Car(5, "Lexus", "Nexus")};
		
		for(Car car : c)
		{
			cxs.create(car);
			alCar.add(car);
		}
	}
	@Test
	public void testReadAllCars() {
		reset();
		List<Car> carListing = cxs.read(new String[0], new String[0]);
		
		assertEquals(alCar,carListing);
		
	}
	@Test
	public void testReadOnlyCarId3() {
		reset();
		List<Car> carListing = cxs.read(new String[0], new String[0]);
		
		assertEquals(alCar,carListing);
		
	}

	@Test
	public void testReadOnlyLexus() {
		reset();
		List<Car> carListing = cxs.read(new String[0], new String[0]);
		
		assertEquals(alCar,carListing);
		
	}
	@Test
	public void testUpdate() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented"); // TODO
	}

}
