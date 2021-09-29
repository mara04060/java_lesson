package com.alphabank.work4;

public class DiningHall {
    static int pizzaNum;
    static int studentID = 1;
    public void makePizza() {
        pizzaNum++;
    }
    public void servePizza() {
        String result;
        if (pizzaNum > 1) {
            result = "Забрал ";
            pizzaNum--;
        } else  {
            result = "Ожидает ";
            pizzaNum =0;
        }
        System.out.println(result + studentID + " пиццу " + pizzaNum);
        studentID++;
    }
}

