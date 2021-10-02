package com.alphabank.model;

import com.alphabank.model.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class ServiceBooks {
    private ArrayList<Book> books;

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ServiceBooks() {
        this.books = SourceBooks.getBooks();
    }

    public List<String> getAllBooks() {
        return ConverterBooks.convert(this.books);
    }

    public void addBook(String param0, String param1, String param2, int param3, int param4, double param5) {
      books.add(new Book(param0, param1, param2, param3, param4, param5));
    }
}
