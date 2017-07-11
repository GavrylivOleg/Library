
package lib;

public class Book {
	
	private String nameOfBook;
	private int dateOfPublic;
	private int numberOfPages;
	public Book(String nameOfBook, int dateOfPublic, int numberOfPages) {
		super();
		this.nameOfBook = nameOfBook;
		this.dateOfPublic = dateOfPublic;
		this.numberOfPages = numberOfPages;
	}
	public String getNameOfBook() {
		return nameOfBook;
	}
	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}
	public int getDateOfPublic() {
		return dateOfPublic;
	}
	public void setDateOfPublic(int dateOfPublic) {
		this.dateOfPublic = dateOfPublic;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dateOfPublic;
		result = prime * result
				+ ((nameOfBook == null) ? 0 : nameOfBook.hashCode());
		result = prime * result + numberOfPages;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (dateOfPublic != other.dateOfPublic)
			return false;
		if (nameOfBook == null) {
			if (other.nameOfBook != null)
				return false;
		} else if (!nameOfBook.equals(other.nameOfBook))
			return false;
		if (numberOfPages != other.numberOfPages)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book [nameOfBook=" + nameOfBook + ", dateOfPublic="
				+ dateOfPublic + ", numberOfPages=" + numberOfPages + "]";
	}
	
	
}
