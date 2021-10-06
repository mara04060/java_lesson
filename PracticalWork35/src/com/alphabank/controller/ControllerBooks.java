package com.alphabank.controller;

import com.alphabank.model.ConverterBooks;
import com.alphabank.model.ServiceBooks;
import com.alphabank.model.entity.Book;
import com.alphabank.view.ViewBooks;
import com.alphabank.view.ViewConstants;

import javax.naming.directory.InvalidSearchControlsException;
import java.util.ArrayList;
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
                    viewBooks.printBooks(ConverterBooks.convert(searchData));
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
        int proc = processValidateProcent();
        for (Book book : serviceBooks.getBooks()) {
            book.setCost((double) Math.round((Math.round(book.getCost() * 100) + Math.round(book.getCost() * proc))) / 100);
        }
    }
    public int processValidateProcent() {
        while (true) {
            String procent = viewBooks.getInfoProcent();
            try {
                int proc = Validator.checkProcent(procent);
                return proc;
            } catch (ArrayIndexOutOfBoundsException exp) {
                if (exp.getMessage().equals("proc")) {
                    viewBooks.printMessage(ViewConstants.ERROR_PROCENT);
                }
            }
        }
    }


    public List processedSearch(String command)  {
        try {
            switch (command) {
                case "author":
                    return new ServiceBooks().searchAuthor(viewBooks.getSearchAuthor());

                case "publisher":
                    return new ServiceBooks().searchPublisher(viewBooks.getSearchPublisher());

                case "year":
                    return new ServiceBooks().searchYear(Validator.checkYear(viewBooks.getSearchYear()));

            }

        } catch (InvalidSearchControlsException exp) {
            if(exp.equals("author")) {
                viewBooks.printMessage(ViewConstants.FORMAT_SEARCH_NOT_FOUND + "\n");
            }
            if(exp.equals("publisher")) {
                viewBooks.printMessage(ViewConstants.FORMAT_SEARCH_PUBLISHER + "\n");
            }
            if(exp.equals("year")) {
                viewBooks.printMessage(ViewConstants.FORMAT_SEARCH_YEAR + "\n");
            }
        }
        return null;
    }


}
