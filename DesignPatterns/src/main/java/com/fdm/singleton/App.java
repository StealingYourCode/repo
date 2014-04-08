package com.fdm.singleton;

import java.awt.List;
import java.util.ArrayList;

public class App {
	
	public static void main(String[] args){
		Storage storage = Storage.getInstance();
		storage.add("Chris");
		storage.add("Dave");
		storage.add("Bob");
		
		Storage st = Storage.getInstance();
		ArrayList<String> names = (ArrayList<String>) st.getNames();
		for(String s : names){
			System.out.println(s);
		}
	}

}
