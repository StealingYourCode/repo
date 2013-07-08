package SpringAOP;

public class ClassA {

	public int method1()
	{
		System.out.println("Class A method1 actual action.");
		return 1;
	}
	public int method1(int x)
	{
		System.out.println("Class A method1 actual action.");
		return 1;
	}
	public void method2()
	{
		System.out.println("Class A method2 actual action.");
	}

}
