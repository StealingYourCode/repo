
public class StringHashCodeDemonstration {

	public static void main(String[] args) {
		
		//demonstrates String constant pool concept 
		String string1 = "Imagination is more important than knowledge."; //string literal is placed into pool memory
		System.out.println("string1:" + string1 + " hashcode ----> " + string1.hashCode());
		
		String string2 = "Study hard in order to get placed quickly...";
		System.out.println("string2:" + string2 + "  hashcode ----> " + string2.hashCode());
		
		String string3 = "Imagination is more important than knowledge.";//string is taken from String pool memory and assigned to string3
		System.out.println("string3:" + string3 + "  hashcode ----> " + string3.hashCode());
		
		if (string1 == string3)
			System.out.println("String1 and string3 are the same object.");
		else
			System.out.println("String1 and string3 are different objects.");
		
		if (string1.equals(string3))
			System.out.println("String1 and string3 are the equivalent object.");
		else
			System.out.println("String1 and string3 are different in content.");
		System.out.println();
		
		//demonstrates non-pool object instantiation
		StringBuilder string4 = new StringBuilder("Reality is merely an illusion, albeit a very persistent one.");
		System.out.println("string4:" + string4 + "  hashcode ----> " + string4.hashCode());
		
		StringBuilder string5 = new StringBuilder("Reality is merely an illusion, albeit a very persistent one.");
		System.out.println("string5:" + string5 + "  hashcode ----> " + string5.hashCode());
		
		if (string4 == string5)
			System.out.println("String4 and string5 are the same object.");
		else
			System.out.println("String4 and string5 are different objects.");
		
		if (string4.equals(string5))
			System.out.println("String4 and string5 are the equivalent object.");
		else
			System.out.println("String4 and string5 are different in content.");
	
	}
}
