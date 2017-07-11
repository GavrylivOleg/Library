package lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import comparators.SortBookByAge;
import comparators.SortBookByNumberOfPages;
import comparators.SortByName;

public class Library {

	Map<Author, List<Book>> map = new HashMap<Author, List<Book>>();
	Scanner scanner = new Scanner(System.in);

	public void addAuthor() {
		System.out.println("enter name of author: ");
		String nameOfAuthor = scanner.next();
		System.out.println("enter surname of author: ");
		String surNameOfAuthor = scanner.next();
		System.out.println("enter height of author: ");
		int height = scanner.nextInt();
		System.out.println("enter weight of author: ");
		int weight = scanner.nextInt();
		System.out.println("enter age of author: ");
		int age = scanner.nextInt();

		Author author = new Author(height, weight, age, nameOfAuthor,
				surNameOfAuthor);
		map.put(author, new ArrayList<Book>());
		System.out.println(map);

	}

	public void addBookForAuthor() {
		System.out.println("enter surname of author for adding book: ");
		String surNameAuthor = scanner.next();

		Set<Entry<Author, List<Book>>> set = map.entrySet();
		for (Entry<Author, List<Book>> entry : set) {
			if (entry.getKey().getSurNameOfAuthor()
					.equalsIgnoreCase(surNameAuthor)) {
				System.out.println("enter name of book: ");
				String nameOfBook = scanner.next();
				System.out.println("enter number of pages: ");
				int numberOfPages = scanner.nextInt();
				System.out.println("enter date of publication: ");
				int dateOfPublic = scanner.nextInt();

				entry.getValue().add(
						new Book(nameOfBook, dateOfPublic, numberOfPages));

			}
		}

		System.out.println(map);
	}

	public void removeBookFromAuthor() {
		System.out.println("enter surname of author for remove book: ");
		String surNameAuthor = scanner.next();

		Set<Entry<Author, List<Book>>> set = map.entrySet();
		for (Entry<Author, List<Book>> entry : set) {
			if (entry.getKey().getSurNameOfAuthor()
					.equalsIgnoreCase(surNameAuthor)) {
				System.out.println("enter name of book for remove: ");
				String nameOfBook = scanner.next();
				List<Book> list = entry.getValue();
				Iterator<Book> iter = list.iterator();
				while (iter.hasNext()) {
					if (iter.next().getNameOfBook()
							.equalsIgnoreCase(nameOfBook)) {
						iter.remove();
					}
				}
			}
		}
	}

	public void removeAuthorWithBooks() {
		System.out.println("enter surname of author for remove books: ");
		String surNameAuthor = scanner.next();

		Set<Entry<Author, List<Book>>> set = map.entrySet();
		for (Entry<Author, List<Book>> entry : set) {
			if (entry.getKey().getSurNameOfAuthor()
					.equalsIgnoreCase(surNameAuthor)) {
				map.remove(entry.getKey());
			}
		}
	}

	public void removeAllBookFromAuthor() {
		System.out.println("enter surname of author for remove books: ");
		String surNameAuthor = scanner.next();

		Set<Entry<Author, List<Book>>> set = map.entrySet();
		for (Entry<Author, List<Book>> entry : set) {
			if (entry.getKey().getSurNameOfAuthor()
					.equalsIgnoreCase(surNameAuthor)) {
				entry.getValue().clear();
			}
		}
	}

	public void sortBookByName() {
		System.out.println("enter surname of author for sort book by name : ");
		String surNameAuthor = scanner.next();

		Set<Entry<Author, List<Book>>> set = map.entrySet();
		for (Entry<Author, List<Book>> entry : set) {
			if (entry.getKey().getSurNameOfAuthor()
					.equalsIgnoreCase(surNameAuthor)) {
				Collections.sort(entry.getValue(), new SortByName());
			}

		}
	}
	public void sortBookByDate() {
		System.out.println("enter surname of author for sort book by date : ");
		String surNameAuthor = scanner.next();

		Set<Entry<Author, List<Book>>> set = map.entrySet();
		for (Entry<Author, List<Book>> entry : set) {
			if (entry.getKey().getSurNameOfAuthor()
					.equalsIgnoreCase(surNameAuthor)) {
				Collections.sort(entry.getValue(), new SortBookByAge());
			}

		}
	}
	public void sortBookByNumberOfPages() {
		System.out.println("enter surname of author for sort book by number of pages : ");
		String surNameAuthor = scanner.next();

		Set<Entry<Author, List<Book>>> set = map.entrySet();
		for (Entry<Author, List<Book>> entry : set) {
			if (entry.getKey().getSurNameOfAuthor()
					.equalsIgnoreCase(surNameAuthor)) {
				Collections.sort(entry.getValue(), new SortBookByNumberOfPages());
			}

		}
	}

	public void showLibrary(){
		Set<Entry<Author, List<Book>>> set = map.entrySet();
		for (Entry<Author, List<Book>> entry : set) {
			System.out.println(entry);
		}

	}
	
}
