package login;

public class User 
{
	private String userName;
	private String password;
	
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
	
	public void writeUserDetails(String extra)
	{
		System.out.println("Username: "+ userName+" extra is: "+extra); 
		System.out.println("Password: "+ password+" extra is: "+extra);
	}
}
