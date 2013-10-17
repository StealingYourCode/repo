package com.fdmgroup.java.designpatterns;

interface Product {
	
	public void doProductThings();
}

class RealProduct implements Product {
	
	public void doProductThings(){
		System.out.println("RealProduct things !");
		// Doing Product things...
		// Create everything
	}
}
class OtherProduct implements Product {
	
	public void doProductThings(){
		System.out.println("OtherProduct things !");
		// Doing Product things...
		// Destroy everything
	}
}
// Factory (abstract)
abstract class Factory {
	
	// We know this will always give us something that IS-A Product
	protected abstract Product makeProduct();
	
}

// Factory that actually creates a specific type of Product
class RealFactory extends Factory {
	
	protected Product makeProduct() 
	{
		RealProduct rp = new RealProduct();
		
		//setting up rp to do its job
		return rp;
	}
}
class OtherFactory extends Factory {
	
	protected Product makeProduct() 
	{
		return new OtherProduct();
	}
}

public class FactoryExample {
	
	public static void main( String arg[] ) 
	{
		
		Factory myFactory1 = new RealFactory();
		Factory myFactory2 = new OtherFactory();
		
		Product product1 = myFactory1.makeProduct();
		Product product2 = myFactory2.makeProduct();
		
		Product[] arr = new Product[2];
		arr[0] = product1;
		arr[1] = product2;
		
		for (Product p : arr)
			p.doProductThings();
		
		//product.doProductThings();
	}
	
	
}



