package lib;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Library library = new Library();

		while (true) {

			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				int number = sc.nextInt();
				switch (number) {
				case 1: {
					library.addAuthor();
					break;
				}
				case 2: {
					library.addBookForAuthor();
					break;
				}
				case 3: {
					library.removeBookFromAuthor();
					break;
				}
				case 4: {
					library.removeAuthorWithBooks();
					break;
				}
				case 5: {
					library.removeAllBookFromAuthor();
					break;
				}
				case 6: {
					library.sortBookByName();
					break;
				}
				case 7: {
					library.sortBookByDate();
					break;
				}
				case 8: {
					library.sortBookByNumberOfPages();
					break;
				}
				case 9: {
					library.showLibrary();
					break;
				}
				default: {
					System.out.println("check what did you write!!!");

				}
				}
			} else {
				System.out.println("Error!!!");
			}
		}
	}
}
