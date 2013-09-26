package xml.example;

import java.util.List;

public interface Storage<T> {
	public void create(T item);
	public List<T> read(String[] field, String[] criteria);
	public void update(T OldItem, T NewItem);
	public void delete(T item);
}
