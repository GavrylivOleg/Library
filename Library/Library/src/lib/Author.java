package lib;


public class Author extends Human{

	private String nameOfAuthor;
	private String surNameOfAuthor;
	
	public Author(int height, int weight, int age, String nameOfAuthor,
			String surNameOfAuthor) {
		super(height, weight, age);
		this.nameOfAuthor = nameOfAuthor;
		this.surNameOfAuthor = surNameOfAuthor;
	}

	public String getNameOfAuthor() {
		return nameOfAuthor;
	}

	public void setNameOfAuthor(String nameOfAuthor) {
		this.nameOfAuthor = nameOfAuthor;
	}

	public String getSurNameOfAuthor() {
		return surNameOfAuthor;
	}

	public void setSurNameOfAuthor(String surNameOfAuthor) {
		this.surNameOfAuthor = surNameOfAuthor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nameOfAuthor == null) ? 0 : nameOfAuthor.hashCode());
		result = prime * result
				+ ((surNameOfAuthor == null) ? 0 : surNameOfAuthor.hashCode());
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
		Author other = (Author) obj;
		if (nameOfAuthor == null) {
			if (other.nameOfAuthor != null)
				return false;
		} else if (!nameOfAuthor.equals(other.nameOfAuthor))
			return false;
		if (surNameOfAuthor == null) {
			if (other.surNameOfAuthor != null)
				return false;
		} else if (!surNameOfAuthor.equals(other.surNameOfAuthor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Author [nameOfAuthor=" + nameOfAuthor + ", surNameOfAuthor="
				+ surNameOfAuthor + "]";
	}
	
	
	
}
