package com.alphabank.model;

import com.alphabank.controller.Validator;
import com.alphabank.model.entity.Book;
import com.alphabank.view.ViewBooks;
import com.alphabank.view.ViewConstants;

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

    public ArrayList<Book> processed(ViewBooks viewBooks){
        int searchElement = 0;
        String search = viewBooks.getSearchAuthor();
        ArrayList<Book> searchArr = new ArrayList<>();
        for (Book book : getBooks()) {
            if (book != null &&
                    book.getAuthor().toLowerCase().contains(search.toLowerCase())) {
                searchArr.add(book);
                searchElement++;
            }
        }
        if (searchElement == 0) {
            viewBooks.printMessage(ViewConstants.FORMAT_SEARCH_NOT_FOUND +"\n" + search.toLowerCase() );
        }
        return searchArr;
    }


    public void proccessedAdd(ViewBooks viewBooks) {
        while (true) {
            String bookParams = viewBooks.getInfoBook();
            String[] params = bookParams.split(";");
            try {
                int year = Validator.checkYear(params[3]);
                int pages = Validator.checkPage(params[4]);
                double price = Validator.checkPrice(params[5]);
                addBook(params[0], params[1], params[2], year, pages, price);
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

    public void processedEdit(ViewBooks viewBooks) {
        int proc = processValidateProcent(viewBooks);
        for (Book book : getBooks()) {
            book.setCost((double) Math.round((Math.round(book.getCost() * 100) + Math.round(book.getCost() * proc))) / 100);
        }
    }


    public int processValidateProcent(ViewBooks viewBooks) {
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

    public ArrayList<Book> processedAuthor(ViewBooks viewBooks) {
        int searchElement = 0;
        String search = viewBooks.getSearchAuthor();
        ArrayList<Book> searchArr = new ArrayList<>();
        for (Book book : getBooks()) {
            if (book != null &&
                    book.getAuthor().toLowerCase().contains(search.toLowerCase())) {
                searchArr.add(book);
                searchElement++;
            }
        }
        if (searchElement == 0) {
            viewBooks.printMessage(ViewConstants.FORMAT_SEARCH_NOT_FOUND +"\n" + search.toLowerCase() );
        }
        return searchArr;
    }

    public ArrayList<Book> processedPublisher(ViewBooks viewBooks) {
        int searchElement = 0;
        String search = viewBooks.getSearchPublisher();
        ArrayList<Book> searchArr = new ArrayList<>();
        for (Book book : getBooks()) {
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

    public ArrayList<Book> processedYear(ViewBooks viewBooks) {
        int searchElement = 0;
        ArrayList<Book> searchArr = new ArrayList<>();
        try {
            int year = Validator.checkYear(viewBooks.getSearchYear());
            for (Book book : getBooks()) {
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
