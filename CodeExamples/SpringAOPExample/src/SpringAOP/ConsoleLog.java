package SpringAOP;


public class ConsoleLog {
	public void displayEntry()
	{
		System.out.println("method called.");
	}
	public void displayEntryMethod2()
	{
		System.out.println("method 2 called.");
	}
	public void displayEntryClassB()
	{
		System.out.println("Class B Created.");
	}
	public void aroundCall()
	{
		System.out.println("Yippee!!");
	}
}
