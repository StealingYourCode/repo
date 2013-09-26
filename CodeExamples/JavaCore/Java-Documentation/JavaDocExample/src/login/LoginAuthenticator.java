package login;

import java.util.Collection;

/**
 * LoginAuthenticator contains methods to verify the authenticity 
 * of a user attempting to log into the trading platform.
 * @author shoshana.kesselman
 */
public class LoginAuthenticator 
{
	/**
	 * Returns true if a password was found in the collection of users and false otherwise.
	 * @param users A collection of users currently able to log into the system.
	 * @param password typed by the person currently attempting to log in
	 * @return Returns true if the password was found amongst the given collection of users.	 
	 */
	public boolean passwordMatch(Collection<User> users, String password)
	{
		if (users != null)
			for (User aUser : users)
			{
				if ((aUser.getPassword()).equals(password))
					return true;
			}
		return false;
	}
	
	public boolean userNameMatch(Collection<User> users, String userName)
	{
		if (users != null)
			for (User aUser : users)
			{
				if ((aUser.getUserName()).equals(userName))
					return true;
			}
		return false;
	}
	
	/**
	 * {@link NoUserException} Person will be notified that they have not been able to log in successfully. 
	 * @param users Collection of users for the Trading Platform. 
	 * @param userName Username that was typed in by the current user attempting to log in.
	 * @param password Password that was typed in by the current user attempting to log in.
	 * @return Returns the user whose username and password matches those passed into the method. 
	 * @throws NoUserException Throws NoUserException was a matching user was not found. 
	 * @see NoUserException
	 */
	public User returnMatchedUser(Collection<User> users, String userName, String password)
		throws NoUserException
	{
		if (users != null)
		for (User aUser : users)
		{
			if ((aUser.getUserName()).equals(userName) && 
				(aUser.getPassword()).equals(password))
				return aUser;
		}
		throw new NoUserException();
	}
	
	public void logUserActivity(User user, String extra)
	{
		user.writeUserDetails(extra);
	}
}

