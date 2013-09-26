package factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;


public class ToyFactory 
{
	Properties properties;
	Class myClass;
	
		
	public Toy createToy(String type, String name)
	{
		Toy newToy = null;
		properties = PropertiesLoader.getProperties("Toy.properties");
		
		if (properties != null) 
		{
			String className = properties.getProperty(type);
			
			try {
				//create an array of parameter classes, 
				//in this case we will only use the super constructor which takes a single string 
				Class[] types = new Class[] { String.class };  				
				//create an array of argument values  
				Object[] args = new Object[] {name}; 
				
				Class myclass = Class.forName(className);				 
				//create a constructor with the types array  
				Constructor constructor = myclass.getConstructor(types);  				 
				//now use the args array to create an instance  
				newToy = (Toy) constructor.newInstance(args);
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {				
				e.printStackTrace();
			} catch (InvocationTargetException e) {				
				e.printStackTrace();
			} 		
		}//end if
		return newToy;
	}
}