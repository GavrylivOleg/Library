package comparators;

import java.util.Comparator;

import lib.Book;

public class SortBookByNumberOfPages implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		if(o1.getNumberOfPages()>o2.getNumberOfPages()){
			return 1;
		}else if(o1.getNumberOfPages()<o2.getNumberOfPages()){
			return -1;
		}
		return 0;
	}

}
