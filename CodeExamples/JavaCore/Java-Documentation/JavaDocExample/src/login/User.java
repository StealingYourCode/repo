package login;

/**
 * User represents a user of the trading platform. 
 * All users must have a username and password. 
 * @author shoshana.kesselman
 * @version 1.0
 */

public class User 
{
	private String userName;
	private String password;

	/**
	 * Getter method for private instance variable userName
	 */
	public String getUserName()
	{
		return userName;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setUserName(String name)
	{
		this.userName = name;
	}
	
	
	public void setPassword(String pwd)
	{
		this.password = pwd;
	}
	
	/**
	 * Prints to the console. 
	 * @param extra Additional text that will be displayed alongside the username and password.	 
	 */
	public void writeUserDetails(String extra)
	{
		System.out.println("Username: "+ userName+" extra is: "+extra); 
		System.out.println("Password: "+ password+" extra is: "+extra);
	}
}
