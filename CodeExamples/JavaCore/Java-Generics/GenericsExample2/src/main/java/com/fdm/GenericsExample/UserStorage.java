package com.fdm.GenericsExample;

public class UserStorage implements Storage<User>{

	private Storage<User> store;
	
	public void setStorage(Storage<User> store){
		this.store = store;
	}
	@Override
	public void save(User storable) {
		store.save(storable);
	}
	@Override
	public User get(String id) {
		return store.get(id);
	}
	
}
