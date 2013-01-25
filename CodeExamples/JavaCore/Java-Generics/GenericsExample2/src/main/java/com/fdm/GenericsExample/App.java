package com.fdm.GenericsExample;

public class App 
{
    public static void main( String[] args )
    {
    	User user = new User("Hernan");
    	UserStorage storage = new UserStorage();
    	storage.setStorage(new HashMapStorage<User>());
    	storage.save(user);
    	
    	System.out.println(storage.get(user.getId()));
    }
}
