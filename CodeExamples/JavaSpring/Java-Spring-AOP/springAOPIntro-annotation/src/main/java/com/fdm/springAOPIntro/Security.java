package com.fdm.springAOPIntro;

import java.util.*;

import org.aspectj.lang.annotation.*;

@Aspect
public class Security {

	
	private List<String> words = new ArrayList<String>();
	
	/* Must use && and not and in the below Pointcut execution expressions
	 * Using and causes a nasty error to occue which can take a long time 
	 * to debug if you don't know what the issue is.*/
	@Pointcut("execution(* com.fdm.springAOPIntro.User.setUsername(String)) && args(username)") 
	public void setUsername(String username){
	}
	
	{
		words.add("drop");
		words.add("delete");
		words.add("truncate");
		words.add("remove");
	}
	
	@Before("setUsername(username)")
	public String check(String username){
		for(String word : words){
			if(username.toLowerCase().contains(word)){
				System.err.println("Unsafe word "+word+" found. Could log this or" +
						" throw an exception here.\n");
			}
		}
		return username;
	}
}