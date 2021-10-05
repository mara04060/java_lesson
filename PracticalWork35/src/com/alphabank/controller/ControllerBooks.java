package com.alphabank.controller;

import com.alphabank.model.ConverterBooks;
import com.alphabank.model.ServiceBooks;
import com.alphabank.model.entity.Book;
import com.alphabank.view.ViewBooks;
import com.alphabank.view.ViewConstants;

import java.util.ArrayList;

public class ControllerBooks {
    private ServiceBooks serviceBooks = new ServiceBooks();
    private ViewBooks viewBooks = new ViewBooks();

    public void execute() {
        while (true) {
            viewBooks.printMenu();
            String command = viewBooks.getCommand();
            switch (command) {
                case "view":
                    viewBooks.printBooks(serviceBooks.getAllBooks());
                    break;
                case "add":
                    serviceBooks.proccessedAdd(viewBooks);
                    break;
                case "edit":
                    serviceBooks.processedEdit(viewBooks);
                    break;
                case "author":
                    ArrayList<Book> searchArr = serviceBooks.processedAuthor(viewBooks);
                    viewBooks.printBooks(ConverterBooks.convert(searchArr));
                    break;
                case "publisher":
                    ArrayList<Book> searchPub = serviceBooks.processedPublisher(viewBooks);
                    viewBooks.printBooks(ConverterBooks.convert(searchPub));
                    break;
                case "year":
                    ArrayList<Book> searchYear = serviceBooks.processedYear(viewBooks);
                    viewBooks.printBooks(ConverterBooks.convert(searchYear));
                    break;
                case "exit":
                    System.exit(1);
                default:
                    viewBooks.printMessage(ViewConstants.ERROR);
            }
            viewBooks.printMessage(ViewConstants.SEPARATOR);
        }
    }


}
