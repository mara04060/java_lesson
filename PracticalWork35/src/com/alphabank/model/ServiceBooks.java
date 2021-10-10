package com.alphabank.model;

import com.alphabank.model.entity.Book;
import com.alphabank.view.ViewConstants;


import javax.naming.directory.InvalidSearchControlsException;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List searchAuthor(String search) throws InvalidSearchControlsException {
        List<Book> searchArr = books.stream()
                .filter(book -> book.getAuthor().contains(search.toLowerCase()))
                .collect(Collectors.toList());
        if (searchArr.size() < 1) {
            throw new InvalidSearchControlsException("author");
        }
        return searchArr;
    }

    public List searchPublisher(String search) throws InvalidSearchControlsException {
        int searchElement = 0;
        List<Book> searchArr = new ArrayList<>();
        for (Book book : getBooks()) {
            if (book != null &&
                    book.getPulisher().toLowerCase().contains(search.toLowerCase())) {
                searchArr.add(book);
                searchElement++;
            }
        }
        if (searchElement == 0) {
            throw new InvalidSearchControlsException("publisher");
        }
        return searchArr;
    }

    public List searchYear(int year) throws InvalidSearchControlsException {
        int searchElement = 0;
        List<Book> searchArr = new ArrayList<>();
        for (Book book : getBooks()) {
            if (book != null && book.getYear() >= year) {
                searchArr.add(book);
                searchElement++;
            }
        }
        if (searchElement == 0) {
            throw new InvalidSearchControlsException("year");
        }
        return searchArr;
    }
}
