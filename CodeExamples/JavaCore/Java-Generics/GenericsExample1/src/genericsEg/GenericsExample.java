package genericsEg;

//T stands for the type of data that this generic will represent
public class GenericsExample<T /*extends User*/> 
{
	public void display(T value)
	{
		System.out.println(value.toString());
	}	
}
