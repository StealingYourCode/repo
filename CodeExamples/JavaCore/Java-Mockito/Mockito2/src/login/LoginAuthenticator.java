package login;

import java.util.Collection;

public class LoginAuthenticator 
{
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
