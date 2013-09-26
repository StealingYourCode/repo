package xml.example;


public class Car{

	private Integer carId;
	private String make;
	private String model;
	

	public Car(){
		this(0); //explicit call to constructor in same class
	}

	public Car(int carId){
		
		super(); //explicit call
		this.carId = carId;
		make = null;
		model = null;
	}
	
	public Car(int carId, String make, String model)
	{
		//implicit call super();
		this.carId = carId;
		this.make = make;
		this.model = model;
	}
	public int getCarId(){
		return carId;
	}
	
	public String getMake(){
		return make;
	}
	
	public String getModel(){
		return model;
	}
	
	public void setMake(String make){
		this.make = make;
	}
	
	public void setModel(String model){
		this.model = model;
	}
	
	public boolean equals(Object otherCar){
		return (otherCar instanceof Car) &&
				(this.carId==((Car)otherCar).carId);
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append(carId);
		sb.append(' ');
		sb.append(make);
		sb.append(' ');
		sb.append(model);
		return sb.toString();
	}
}
