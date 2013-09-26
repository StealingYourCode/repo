package FactoryPattern;

public class Product 
{
	private int dataMember1;
	private String dataMember2;
	
	Product(int dm1, String dm2)
	{
		this.dataMember1 = dm1;
		this.dataMember2 = dm2;
	}
	
	public String toString()
	{
		return "Product dataMember1: "+dataMember1+
			   "Product dataMember2: "+dataMember2;
	}
}

class SubProductOdd extends Product
{
	SubProductOdd(int dm1, String dm2)
	{
		super(dm1,dm2);
	}
	
	public String toString()
	{
		return "SubProductOdd dataMember1: "+super.toString();
	}
}

class SubProductEven extends Product
{
	SubProductEven(int dm1, String dm2)
	{
		super(dm1,dm2);
	}
	
	public String toString()
	{
		return "SubProductEven dataMember1: "+super.toString();
	}
}