package com.alphabank.model.entity;

import java.util.ArrayList;


public class Declar {
    static final String BOOKS = "BOOKS";
    static final String BOOK = "BOOK";
    private ArrayList<String> books = new ArrayList<>();

    public class Book {

        static final String AUTHOR = "AUTHOR";
        static final String TITLE = "TITLE";
        static final String PUBLISHER = "PUBLISHER";
        static final String YEAR = "YEAR";
        static final String PAGE = "PAGE";
        static final String PRICE = "PRICE";

        private String author; //AUTHOR
        private String title; //TITLE
        private String publisher; //PUBLISHER
        private String year; //YEAR
        private String page; // PAGE
        private String price; //PRICE

        public String getAuthor() {
            return author;
        }

        public String getTitle() {
            return title;
        }

        public String getPublisher() {
            return publisher;
        }

        public String getYear() {
            return year;
        }

        public String getPage() {
            return page;
        }

        public String getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Declar{" +
                    "author='" + author + '\'' +
                    ", title='" + title + '\'' +
                    ", publisher='" + publisher + '\'' +
                    ", year='" + year + '\'' +
                    ", page='" + page + '\'' +
                    ", price='" + price + '\'' +
                    '}';
        }
    }
}
