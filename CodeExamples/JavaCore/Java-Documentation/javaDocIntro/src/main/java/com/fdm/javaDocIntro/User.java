/**
 * 
 */
package com.fdm.javaDocIntro;

/**
 * This is the User class which encapsulates the full concept of a User.
 * It can be used at any specific point without issue.
 * @author kevin.timmins
 * @version 0.1
 */
public class User {
	
	
	/**
	 * User's username
	 */
	private String username;

	
	/**
	 * Method to set the username
	 * @param username
	 * @since 0.1
	 */
	public void setUsername(String username){
		this.username = username;
	}
	
	/**
	 * Method to return the users username
	 * @return username
	 * @since 0.1
	 */
	public String getUsername(){
		return username;
	}
	
}
