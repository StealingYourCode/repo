
public class StringImmutabilityDemonstration {
	public static void main(String[] args) {
		
		//code snippet demonstrating immutability for java.lang.String
		String immutableString = "French ";
		System.out.println("java.lang.String immutableString: " + immutableString);
		System.out.println(immutableString.concat("Fries!"));
		System.out.println(immutableString.toUpperCase());
		System.out.println("java.lang.String immutableString: " + immutableString);
		
		//code snippet demonstrating mutability for java.lang.StringBuilder
		StringBuilder stringBuilderMutableString = new StringBuilder("French ");
		stringBuilderMutableString.append("Fries.");
		//stringBuilderMutableString.reverse();
		System.out.println("java.lang.StringBuilder mutableString: " + stringBuilderMutableString);
		
		//code snippet demonstrating mutability for java.lang.StringBuffer
		StringBuffer stringBufferMutableString = new StringBuffer("French ");
		stringBufferMutableString.append("Fries.");
		System.out.println("java.lang.StringBuffer mutableString: " + stringBufferMutableString);
		
	}
}
