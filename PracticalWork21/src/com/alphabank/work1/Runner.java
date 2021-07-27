package com.alphabank.work1;

import java.util.Scanner;

public class Runner {
    public void run() {
//        Book book1 = new Book(2021, 23);
//        book1.view();
//        Book book2 = new Book("Mike Mouse", "Card House", "White House");
//        book2.setCost(234.92);
//        book2.view();
//
//        book1.setId(1);
//        book1.setAuthor("Иванов");
//        book1.setYear(2020);
//        book1.setCost(250.5);
//        book1.view();

        String search;
        int year;

        Book[] books = createArrBooks(10);
        books = addProcent(books, 10);
        arrView(books);

        Scanner sc = new Scanner(System.in);
        search = inputString(sc);
        year = inputNumber(sc);


        if (year >= 1200) {
            viewYear(books, year);
        }
        if (!search.equals("") && !search.equals(" ") ) {
            viewAuthor(books, search);
            viewPublisher(books, search);
        }
    }


    public int inputNumber(Scanner sc) {
        System.out.print(ANSI_GREEN+"Ввести год поиска-> "+ANSI_RESET);
        while (true) {
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number > 1200) return number;
            } else {
                sc.next();
            }
            System.out.println(ANSI_RED+"Ошибка ввода числа!!!\r\n введите корректную дату >1200 года"+ANSI_RESET);
        }
    }


    public String inputString(Scanner sc) {

        System.out.print(ANSI_GREEN+"Ввести поиск по Автору или Изданию -> "+ANSI_RESET);
        return sc.nextLine();
    }




    public Book[] createArrBooks(int size){

        Book[] arrObj = new Book[size];

        for (int i = 0; i < size; i++) {
            int year = Runner.generatorInt(1901,2021);
            int page = generatorInt(50,700);
            String author = generatorName();
            String title = generatorTitle();
            String publisher = generatorPublisher();
            Double cost = (double)generatorInt(10000, 50000)/100;
            Integer id = i+1; //Runner.generatorInt(50, 100);
            arrObj[i] = new Book(author, title, publisher, cost, year, page, id);

     }
        return arrObj;
    }

    /**
     *
     * @param arrObj
     */
    public void arrView(Book[] arrObj) {
        int i =0;
        for (Book arr: arrObj) {
            if(arr != null) {

                System.out.printf(
                        " ID=" + arr.getId() + "\t" +
                                arr.getTitle() + "\t" +
                                arr.getAuthor() + "\t" +
                                arr.getPublisher() + "\t" +
                                arr.getPage() + "\t" +
                                arr.getYear() + "\t" +
                                arr.getCost() + " \r\n"
                );
                i++;
            }
        }
    }


    public Book[] addProcent(Book[] books, int procent) {
        for (Book b: books) {
            Double newPrice = Math.ceil((b.getCost() + b.getCost()*procent)*100)/100;
            b.setCost(newPrice);
        }
        return books;

    }

    public void viewAuthor(Book[] books, String search) {
        Book[] arrayResult = new Book[books.length];
        int i = 0;
        int searchPosition = -1;
        for (Book b: books) {
            searchPosition = b.getAuthor().toLowerCase().indexOf(search.toLowerCase());

            if(searchPosition > -1) {
                String author = b.getAuthor();
                author = author.replace( search, ANSI_CYAN + search + ANSI_RESET);
                b.setAuthor(author);
                arrayResult[i++] = b;
            }
        }

        if (i==0) {
            System.out.println(ANSI_RED+"Ничего" +ANSI_RESET+" не найдено по Автору\r\n Искали:" +ANSI_RED+ search +ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN+"Найден автор: "+ANSI_RESET);
            arrView(arrayResult);
        }


    }


        public void viewPublisher(Book[] books, String search) {
        Book[] arrayResult = new Book[books.length];
        int i = 0;
        int searchPosition = -1;
        for (Book b: books) {
            searchPosition = b.getPublisher().toLowerCase().indexOf(search.toLowerCase());

            if(searchPosition > -1) {
                String publisher = b.getPublisher();
                publisher = publisher.replace( search, ANSI_CYAN + search + ANSI_RESET);
                b.setPublisher(publisher);
                arrayResult[i++] = b;
            }
        }

        if (i==0) {
            System.out.println(ANSI_RED+"Ничего" +ANSI_RESET+" не найдено по Издательству\r\n Искали:" +ANSI_RED+ search +ANSI_RESET);
        } else {
            System.out.println(ANSI_GREEN+"Найдено издательство: "+ANSI_RESET);
            arrView(arrayResult);
        }



    }


    public void viewYear(Book[] books, int search) {
        Book[] arrayResult = new Book[books.length];
        int i = 0;
        for (Book b : books) {

            if (b.getYear() >= search) {
                arrayResult[i++] = b;
            }
        }

        if (i == 0) {
            System.out.println(ANSI_RED + "Ничего" + ANSI_RESET + " не найдено c даты\r\n Искали:" + ANSI_RED + search + ANSI_RESET + " года");
        } else {
            System.out.println(ANSI_GREEN + "Найдено c даты (" +search+"): " + ANSI_RESET);
            arrView(arrayResult);
        }
    }





    /*
    Изменить расцветку консоли, выделить найденные элементы
    */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    /*
    методы генерации случаянных авторов и книг. страниц и т.п.
     */
    private String generatorName(){
        String[] arrAuthor = {
                "Ivan Zaharov",
                "Lensky Evgeny",
                "Fedoroff Valeriy",
                "Bedrov Genadiy",
                "Fedor Buse",
                "Addamoff 50 Cent",
                "1990 Fox"
        };
        int max = arrAuthor.length;
        return arrAuthor[generatorInt(0,--max)];
    }


    private String generatorTitle(){
        String[] arrTitle = {
                "The Book for Chainikoff",
                "Evgeniy Onegin ... to be continue",
                "The 50 color of gray",
                "My 100 Frends",
                "People are to People",
                "Hard days night...",
                "20 cent Fox",
                "Full down Up and Me"
                };
        int max = arrTitle.length;
        return arrTitle[generatorInt(0,--max)];
    }

    private String generatorPublisher(){
        String[] arrTitle = {
                "White House",
                "Book House",
                "Print to Me",
                "Veselka",
                "ABABAGALAMAGA",
                "Socium",
                "Verbose",
                "PiterFM"
        };
        int max = arrTitle.length;
        return arrTitle[generatorInt(0,--max)];
    }

    public static Integer generatorInt(int min, int max){
        max -= min+1;
        return (int)(Math.random() * max) + min;
    }


}



