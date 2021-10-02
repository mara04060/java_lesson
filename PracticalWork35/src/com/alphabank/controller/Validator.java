package com.alphabank.controller;


public class Validator {
    public static int checkYear(String year) {
        int yy = Integer.parseInt(year);
        if (yy < 1800 || yy > 2021) {
            throw new ArrayIndexOutOfBoundsException("year");
        }
        return yy;
    }

    public static double checkPrice(String price) {
        double pr = Double.parseDouble(price);
        if(pr > 9999 || pr < 0) {
            throw new ArrayIndexOutOfBoundsException("price");
        }
        return pr;
    }

    public static int checkPage(String page) {
        int pg = Integer.parseInt(page);
        if(pg > 9999 || pg <= 4) {
            throw new ArrayIndexOutOfBoundsException("page");
        }
        return pg;
    }

    public static int checkProcent(String procent) {
        int pr = Integer.parseInt(procent);
        if(pr > 100 || pr < 0) {
            throw new ArrayIndexOutOfBoundsException("procent");
        }
        return pr;
    }

}
