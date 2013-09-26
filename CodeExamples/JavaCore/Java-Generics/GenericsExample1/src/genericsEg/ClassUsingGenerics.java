package genericsEg;

import java.util.ArrayList;

public class ClassUsingGenerics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenericsExample<String> genericString = new GenericsExample<String>();
		GenericsExample<Integer> genericInteger = new GenericsExample<Integer>();
		GenericsExample<User> genericUser = new GenericsExample<User>();
		User myUser = new User("Shana","Kesselman");
		
		genericString.display("My name is Luca");
		genericInteger.display(27);
		genericUser.display(myUser);
		genericUser.display(new User("Chris","Where are you going?"));
		
		
		
	}

}
