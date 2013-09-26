package FactoryPattern;

public class ProductFactory 
{
	private static int idVal = 100;
	
	public static Product makeProduct(int prodNum)
	{
		if (prodNum%2 == 0)
			return new SubProductOdd(prodNum, "Name of " + idVal++);
		else
			return new SubProductEven(-1, "Name of " + idVal++);
	}

}
