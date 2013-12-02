package com.fdmgroup.comparing;
import java.util.Comparator;

/* The Comparator interface provides a more flexible method of comparing 
 * objects. You do not need to go 'into' the Book class to change its
 * compareTo method. You merely create another Comparator. 
 * */

public class TitleSort implements Comparator<Book>
{
	public int compare(Book one, Book two)
	{
		return one.getTitle().compareTo(two.getTitle());
	}
}
