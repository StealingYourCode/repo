package com.fdm.genericsExample;

public class StorageHandler<E extends Storable, D extends Storage> {

	private D storage;
	private StorableFactory factory;
	
	public StorageHandler(StorableFactory factory){
		this.factory = factory;
	}
	
	public void add(E storable)
	{
		storage.write(storable.details());
	}
	
	public Storable get(String elementId){
		return factory.get(storage.read(elementId));
	}
	
}