package com.fdmgroup.mockito;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestLogInManager {

	static LogInManager manager;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		
		manager = new LogInManager();
	}

	@Test
	public void testLogInSuccess() {
		
		// Create the mock
		User testUser = mock(User.class);
		
		// Stubbing
		when(testUser.getUsername()).thenReturn("admin");
		when(testUser.isLoggedIn()).thenReturn(false);
		
		assertTrue(manager.logIn(testUser));
		
		verify(testUser).getUsername();
		verify(testUser).getPassword();
		verify(testUser).isLoggedIn();
		
	}

}
