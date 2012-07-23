package com.fdm.platform.registration;


public interface _ActionManager {

	public UserAccountDTO changePassword(String username, String oldpassword, String newPassword)
			throws ActionManagerException;

	public UserAccountDTO createNewUser(String username, String password)
			throws ActionManagerException;
	
	public UserAccountDTO banUser(String username)
			throws ActionManagerException;
	
	public UserAccountDTO unbanUser(String username)
			throws ActionManagerException;
	
	public UserAccountDTO makeUserAdmin(String username)
			throws ActionManagerException;
	
	public UserAccountDTO login(String username, String password)
			throws ActionManagerException;
	
}
