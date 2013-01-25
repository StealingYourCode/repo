package com.fdm.GenericsExample;

public interface Storage<T extends Storable> {
	void save(T storable);
	T get(String id);
}
