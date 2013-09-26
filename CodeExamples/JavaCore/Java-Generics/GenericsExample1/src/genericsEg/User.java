package genericsEg;

public class User 
{
	private String firstName;
	private String lastName;

	public User(String firstname, String lastname)
	{
		this.firstName = firstname;
		this.lastName = lastname;
	}
	
	public String toString()
	{
		return firstName+" "+lastName;
	}

}
