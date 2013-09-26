
public class FieldModifiers 
{
    static int myInt;
    static private int myPrivateInt = 8;
    final static protected int myProtectedInt = 9;

	public static int getMyInt() {
		return myInt;
	}
	
	public static void setMyInt(int myInt) {
		FieldModifiers.myInt = myInt;
	}

	public static int getMyPrivateInt() {
		return myPrivateInt;
	}

	public static void setMyPrivateInt(int myPrivateInt) {
		FieldModifiers.myPrivateInt = myPrivateInt;
	}
	
	public static void main (String[] args)
	{
		FieldModifiers item1 = new FieldModifiers();
		FieldModifiers item2 = new FieldModifiers();
		
		//See that both item1 and item2 share myInt because it is static.
		item1.setMyInt(5);
		System.out.println("Item1 int: "+item1.getMyInt());
		System.out.println("Item2 int: "+item2.getMyInt());
		
		//See that we can set myInt without even having 
		//an instance of the class.
		FieldModifiers.setMyInt(7);
		System.out.println("Item1 int: "+item1.getMyInt());
		System.out.println("Item2 int: "+item2.getMyInt());
		
		DifferentClass diff = new DifferentClass();
		diff.accessStatic();
	}
	
}

class DifferentClass
{
	public void accessStatic()
	{
	   //see that from another class, we cannot access myPrivateInt
	   //directly. But we can access it through it's public getter. 
	   //System.out.println(FieldModifiers.myPrivateInt);
	   FieldModifiers.getMyPrivateInt();
	   
	   //We can access my ProtectedInt because we are in the same package.
	   System.out.println(FieldModifiers.myProtectedInt);
	  
	   //Cannot assign a vlaue to a final field
	   //FieldModifiers.myProtectedInt = 10;
	}
}
