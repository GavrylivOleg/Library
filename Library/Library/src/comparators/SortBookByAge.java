package comparators;

import java.util.Comparator;

import lib.Book;

public class SortBookByAge implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		if(o1.getDateOfPublic()>o2.getDateOfPublic()){
			return 1;
		}else if(o1.getDateOfPublic()<o2.getDateOfPublic()){
			return -1;
		}
		return 0;
	}

}
