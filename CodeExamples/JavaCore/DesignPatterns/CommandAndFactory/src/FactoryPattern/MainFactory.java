package FactoryPattern;

import java.util.ArrayList;

public class MainFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Product> prodArray = new ArrayList<Product>();
		
		for (int i=0; i<10; i++)
		{
			prodArray.add(ProductFactory.makeProduct(i));
		}
		
		for (Product p : prodArray)
		{
			System.out.println(p);
		}

	}

}
