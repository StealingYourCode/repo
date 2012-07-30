package com.fdm.springAOPIntro;

import java.util.*;

public class Security {

	private List<String> words = new ArrayList<String>();
	
	{
		words.add("drop");
		words.add("delete");
		words.add("truncate");
		words.add("remove");
	}
	
	public String check(String input){
		for(String word : words){
			if(input.toLowerCase().contains(word)){
				System.err.println("Unsafe word "+word+" found. Could log this or" +
						" throw an exception here.\n");
			}
		}
		return input;
	}
}