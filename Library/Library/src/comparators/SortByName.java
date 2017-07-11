package comparators;

import java.util.Comparator;

import lib.Book;

public class SortByName implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		 
		return o1.getNameOfBook().compareTo(o2.getNameOfBook());
	}

}
