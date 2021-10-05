package com.alphabank.model;

import com.alphabank.model.entity.Book;
import com.alphabank.model.entity.StaxX;

import java.util.ArrayList;


public class SourceBooks {
    public static ArrayList<Book> getBooksOld() {
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
        arrayList.add(new Book("Morozova", "Game of Thrones", "BHV", 2018, 95, 55.0));
        arrayList.add(new Book("Nextoff", "Sound for All", "BHV", 2006, 125, 515.0));
        arrayList.add(new Book("Smirnoff", "All in All", "BMV", 2005, 712, 175.0));
        arrayList.add(new Book("Vovkin", "The Sabotage", "BMV", 2006, 105, 195.0));
        arrayList.add(new Book("Pluginoff", "Comp is Dump", "BSV", 2007, 115, 185.0));
        arrayList.add(new Book("Rostoff", "To be or not to Be", "BMV", 2009, 95, 165.0));

        return arrayList;
    }

    public static ArrayList<Book> getBooks() {
        return new StaxX().readXML(".\\resource\\books.xml");
    }

}