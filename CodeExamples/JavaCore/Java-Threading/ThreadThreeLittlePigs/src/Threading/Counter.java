package Threading;

public class Counter {
	private int count;
	
	Counter()
	{
		count=0;
	}
	
	public void setCount(int i)
	{
		count=i;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void incrementCount()
	{	
		count++;	
	}	
	
	public void decrementCount()
	{
		count--;
	}
}
