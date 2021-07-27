package com.alphabank.work1;

public class Book {
    private int id;
    private String author;
    private String title;
    private String publisher;
    private int year;
    private int page;
    private double cost;


    /**
     *
     * @param year
     * @param price
     */
     public Book(int year, double price) {
        this.id = Runner.generatorInt(50, 100);
        this.year = year;
        this.cost = price;
        this.author = "Author Default";
        this.publisher = "Веселка";
        this.page = 100;
    }

    /**
     *
     * @param author
     * @param title
     * @param publisher
     */
    public Book(String author, String title, String publisher, Double cost, Integer year, Integer page, Integer id) {
        this.id = id;
        this.year = year;
        this.page = page;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public void view() {
        System.out.print(
                getId() + "\t"
                + author + "\t"
                + title + "\t"
                + publisher + "\t"
                + year + "\t"
                + page + "\t"
                + cost);
    }
}
