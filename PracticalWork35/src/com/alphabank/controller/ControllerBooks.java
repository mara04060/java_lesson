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
                    proccessedAdd();
                    break;
                case "edit":
                    processedEdit();
                    break;
                case "author":
                    ArrayList<Book> searchArr = processedAuthor();
                    viewBooks.printBooks(ConverterBooks.convert(searchArr));
                    break;
                case "publisher":
                    ArrayList<Book> searchPub = processedPublisher();
                    viewBooks.printBooks(ConverterBooks.convert(searchPub));
                    break;
                case "year":
                    ArrayList<Book> searchYear = processedYear();
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

    private void proccessedAdd() {
        while (true) {
            String bookParams = viewBooks.getInfoBook();
            String[] params = bookParams.split(";");
            try {
                int year = Validator.checkYear(params[3]);
//                Тут окончили
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

    private void processedEdit() {
        int proc = processValidateProcent();
        for (Book book : serviceBooks.getBooks()) {
            book.setCost((double) Math.round((Math.round(book.getCost() * 100) + Math.round(book.getCost() * proc))) / 100);
        }
    }

    private int processValidateProcent() {
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

    private ArrayList<Book> processedAuthor() {
        int searchElement = 0;
        String search = viewBooks.getSearchAuthor();
        ArrayList<Book> searchArr = new ArrayList<>();
        for (Book book : serviceBooks.getBooks()) {
            if (book != null &&
                    book.getAuthor().toLowerCase().indexOf(search.toLowerCase()) >= 0) {
                searchArr.add(book);
                searchElement++;
            }
        }
        if (searchElement == 0) {
            viewBooks.printMessage(ViewConstants.FORMAT_SEARCH_NOT_FOUND +"\n" + search.toLowerCase() );
        }
        return searchArr;
    }

    private ArrayList<Book> processedPublisher() {
        int searchElement = 0;
        String search = viewBooks.getSearchPublisher();
        ArrayList<Book> searchArr = new ArrayList<>();
        for (Book book : serviceBooks.getBooks()) {
            if (book != null &&
                    book.getPulisher().toLowerCase().lastIndexOf(search.toLowerCase()) >= 0) {
                searchArr.add(book);
                searchElement++;
            }
        }
        if (searchElement == 0) {
            viewBooks.printMessage(ViewConstants.FORMAT_SEARCH_NOT_FOUND);
        }
        return searchArr;
    }

    private ArrayList<Book> processedYear() {
        int searchElement = 0;
        ArrayList<Book> searchArr = new ArrayList<>();
        try {
            int year = Validator.checkYear(viewBooks.getSearchYear());
            for (Book book : serviceBooks.getBooks()) {
                if (book != null && book.getYear() >= year) {
                    searchArr.add(book);
                    searchElement++;
                }
            }
            if (searchElement == 0) {
                viewBooks.printMessage(ViewConstants.FORMAT_SEARCH_NOT_FOUND);
            }
        } catch (ArrayIndexOutOfBoundsException exp) {
            if (exp.getMessage().equals("year")) {
                viewBooks.printMessage(ViewConstants.ERROR_YEAR);
            }
        }
        return searchArr;
    }
}
