package com.alphabank.model;

import com.alphabank.model.entity.Book;

import java.util.ArrayList;


public class SourceBooks {
    public static ArrayList<Book> getBooks() {
        ArrayList<Book> arrayList = new ArrayList<>();
        arrayList.add(new Book("Morozov", "Skoloff people are People", "BHV", 2010, 345, 200.0));
        arrayList.add(new Book("Shevchenko", "Thepovit", "Word", 2010, 1000, 760.0));
        arrayList.add(new Book("Nerus", "Spravoshnik programming code", "AL", 2017, 505, 444.0));
        arrayList.add(new Book("Morozov", "Boyarynya Morozova", "Word", 1987, 120, 120.0));
        arrayList.add(new Book("Grushin", "Newer Mind", "BHV", 1999, 765, 155.0));
        arrayList.add(new Book("Sedoff", "Spravoshnik", "BHV", 2009, 125, 500.0));
        arrayList.add(new Book("Smirnoff", "Vodka i ee primenenie", "BHV", 2020, 135, 555.0));
        arrayList.add(new Book("Pushkin", "The Skazki", "BHV", 2009, 265, 145.0));
        arrayList.add(new Book("Pushkin", "The Stihi", "BHV", 2008, 705, 505.0));
        return arrayList;
    }
}