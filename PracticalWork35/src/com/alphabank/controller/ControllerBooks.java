package com.alphabank.controller;

import com.alphabank.model.ConverterBooks;
import com.alphabank.model.ServiceBooks;
import com.alphabank.model.entity.Book;
import com.alphabank.view.ViewBooks;
import com.alphabank.view.ViewConstants;

import javax.naming.directory.InvalidSearchControlsException;
import java.util.List;

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
                    proccessedAdd();
                    break;
                case "edit":
                    processedEdit();
                    break;
                case "author":
                case "publisher":
                case "year":

                    List searchData = processedSearch(command);
                    if (searchData != null && searchData.size() > 0) {
                        viewBooks.printBooks(ConverterBooks.convert(searchData));
                    }
                    break;
                case "exit":
                    System.exit(1);
                default:
                    viewBooks.printMessage(ViewConstants.ERROR);
            }
            viewBooks.printMessage(ViewConstants.SEPARATOR);
        }
    }

    public void proccessedAdd() {
        while (true) {
            String bookParams = viewBooks.getInfoBook();
            String[] params = bookParams.split(";");
            try {
                int year = Validator.checkYear(params[3]);
                int pages = Validator.checkPage(params[4]);
                double price = Validator.checkPrice(params[5]);
                serviceBooks.addBook(params[0], params[1], params[2], year, pages, price);
                break;
            } catch (ArrayIndexOutOfBoundsException exp) {
                if (exp.getMessage().equals("year")) {
                    viewBooks.printMessage(ViewConstants.ERROR_YEAR);
                }
                if (exp.getMessage().equals("price")) {
                    viewBooks.printMessage(ViewConstants.ERROR_PRICE);
                }
                if (exp.getMessage().equals("page")) {
                    viewBooks.printMessage(ViewConstants.ERROR_PAGE);
                }

            }
        }
    }

    public void processedEdit() {
        int proc = 0;
        try {
            proc = processValidateProcent();
        } catch (ArrayIndexOutOfBoundsException exp) {
            viewBooks.printMessage(ViewConstants.ERROR_PROCENT);
        }
        for (Book book : serviceBooks.getBooks()) {
            book.setCost((double) Math.round((Math.round(book.getCost() * 100) + Math.round(book.getCost() * proc))) / 100);
        }
    }

    public int processValidateProcent() throws ArrayIndexOutOfBoundsException {
        String procent = viewBooks.getInfoProcent();
        return Validator.checkProcent(procent);
    }


    public List processedSearch(String command) {

        while (true) {
            switch (command) {
                case "author":
                    try {
                        return new ServiceBooks().searchAuthor(viewBooks.getSearchAuthor());
                    } catch (InvalidSearchControlsException exp) {
                        viewBooks.printMessage(ViewConstants.FORMAT_SEARCH_NOT_FOUND);
                    }
                    break;

                case "publisher":
                    try {
                        return new ServiceBooks().searchPublisher(viewBooks.getSearchPublisher());
                    } catch (InvalidSearchControlsException exp) {
                        viewBooks.printMessage(ViewConstants.FORMAT_SEARCH_PUBLISHER);
                    }
                    break;
                case "year":
                    try {
                        int year = Validator.checkYear(viewBooks.getSearchYear());
                        return new ServiceBooks().searchYear(year);
                    } catch (ArrayIndexOutOfBoundsException | InvalidSearchControlsException exp) {
                        viewBooks.printMessage(ViewConstants.FORMAT_SEARCH_NOT_FOUND);
                    }

            }
        }

    }
}
