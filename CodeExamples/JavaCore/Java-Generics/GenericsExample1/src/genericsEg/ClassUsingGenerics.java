/* First demo of generics - very basic.  See that we can 
 * instantiate different different GenericsExample objects, 
 * but each will only work with one type of object.  
 * 
 * See that if I change the GenericsExample class to be 
 * <T extends User> then the compiler no longer lets me 
 * create a GenericExample instance for anything other than
 * a User or it's subtype. 
 * */

package genericsEg;


public class ClassUsingGenerics {

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
