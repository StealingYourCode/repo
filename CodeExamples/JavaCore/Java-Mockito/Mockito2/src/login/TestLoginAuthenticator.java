package login;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;


import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestLoginAuthenticator 
{
	
	private LoginAuthenticator authenticator;
	private ArrayList<User> users;
	User mockUser1,mockUser2,mockUser3;
	
	@Before
	public void setUp()
	{
		authenticator = new LoginAuthenticator();
		
		mockUser1 = mock(User.class);		
		when(mockUser1.getPassword()).thenReturn("Kesselman");
		when(mockUser1.getUserName()).thenReturn("Shana");
		
		mockUser2 = mock(User.class);		
		when(mockUser2.getPassword()).thenReturn("Newman");		
		when(mockUser2.getUserName()).thenReturn("Craig");
		
		mockUser3 = mock(User.class);		
		when(mockUser3.getPassword()).thenReturn("Tsymbalenko");
		when(mockUser3.getUserName()).thenReturn("Tatyana");
		
		users = new ArrayList<User>();
		users.add(mockUser1);
		users.add(mockUser2);
		users.add(mockUser3);
	}
	
	@Test
	public void testPasswordMatch_Return_True() 
	{	
		assertTrue(authenticator.passwordMatch(users, "Newman"));
	}
	
	@Test
	public void testPasswordMatch_Return_False() 
	{	
		boolean result = authenticator.passwordMatch(users, "WrongPassword");
		assertEquals(result,false);	
	}
	
	@Test
	public void testPasswordMatch_Return_False_When_Collection_Is_Null() 
	{	
		assertFalse(authenticator.passwordMatch(null, "Kesselman"));
	}

	@Test
	public void testPasswordMatch_Return_False_When_No_Users_Exist() 
	{	
		ArrayList<User> users2 = new ArrayList<User>();
		assertFalse(authenticator.passwordMatch(users2, "Kesselman"));
	}
	
	
	
	
	
	@Test
	public void testUserNameMatch_Return_True() 
	{	
		assertTrue(authenticator.userNameMatch(users, "Craig"));
	}
	
	@Test
	public void testUserNameMatch_Return_False() 
	{			
		assertFalse(authenticator.userNameMatch(users, "WrongUserName"));
	}
	
	@Test
	public void testUserNameMatch_Return_False_When_Collection_Is_Null() 
	{	
		assertFalse(authenticator.userNameMatch(null, "Shana"));
	}

	@Test
	public void testUserNameMatch_Return_False_When_No_Users_Exist() 
	{	
		ArrayList<User> users2 = new ArrayList<User>();
		assertFalse(authenticator.userNameMatch(users2, "Shana"));
	}
	
	
	
	
	@Test
	public void testReturnMatchedUser_Returns_Correct_User()
	{
		try 
		{
			User result = authenticator.returnMatchedUser(users,"Shana","Kesselman");
			assertTrue(result.getUserName().equals("Shana") && result.getPassword().equals("Kesselman"));
		}
		catch (NoUserException e)
		{
			assertTrue(false);
			System.out.println("No User Found in " +
					"testReturnMatchedUser_Returns_CorrectUser(): "+e.getMessage());
		}
	}
	
	
	
	@Test
	public void testReturnMatchedUser_Fails_V2() 
	{
		try 
		{
			authenticator.returnMatchedUser(users,"Mickey","Mouse");
			fail("This should have failed because there is no Mickey Mouse user");
		}
		catch (NoUserException e)
		{
			assertTrue(true);
			System.out.println("No User Found in testReturnMatchedUser_Fails: "+e.getMessage());
		}
	}
	
	//A better way of testing for an exception
	@Test(expected=NoUserException.class)
	public void testReturnMatchedUser_Fails() throws NoUserException
	{
		authenticator.returnMatchedUser(users,"Mickey","Mouse");
	}
	
	

	@Test
	public void testLogUserActivityCallsCorrectMethod()
	{
		authenticator.logUserActivity(mockUser1,"my added variable");
		verify(mockUser1).writeUserDetails("my added variable");
	}
	
	@Test
	public void testLogUserActivityCallsMethodFails()
	{
		authenticator.logUserActivity(mockUser1,"my added variable");
		verify(mockUser1,org.mockito.Mockito.times(0)).writeUserDetails("my variable");
	}
	
}
