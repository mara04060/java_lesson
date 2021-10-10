package com.alphabank.controller;


public class Validator {
    public static int checkYear(String year) {
        int yy;
        try {
            yy = Integer.parseInt(year);
        } catch (NumberFormatException e) {
            throw new ArrayIndexOutOfBoundsException("year");
        }
        if (yy < 1800 || yy > 2021) {
            throw new ArrayIndexOutOfBoundsException("year");
        }
        return yy;

    }

    public static double checkPrice(String price) {
        double pr =0.0;
        try {
            pr = Double.parseDouble(price);
        } catch (NumberFormatException exp ) {
            throw new ArrayIndexOutOfBoundsException("price");
        }
        if (pr > 9999 || pr < 0) {
            throw new ArrayIndexOutOfBoundsException("price");
        }
        return pr;
    }

    public static int checkPage(String page) {

        int pg = 0;
        try {
            pg = Integer.parseInt(page);
        } catch (NumberFormatException exp) {
            throw new ArrayIndexOutOfBoundsException("page");
        }
        if (pg > 9999 || pg <= 4) {
            throw new ArrayIndexOutOfBoundsException("page");
        }
        return pg;
    }

    public static int checkProcent(String procent) {
        int pr = 0;
        try {
            pr = Integer.parseInt(procent);
        } catch (NumberFormatException exp) {
            throw new ArrayIndexOutOfBoundsException("procent");
        }
        if (pr > 100 || pr < 0) {
            throw new ArrayIndexOutOfBoundsException("procent");
        }
        return pr;
    }

}
