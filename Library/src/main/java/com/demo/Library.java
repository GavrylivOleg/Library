package com.demo;

import com.demo.entity.Book;
import java.util.List;

public interface Library {

    void addBook();
    void removebookByName();
    void editBook();
    List<Book> allBooks();
}
