package com.alphabank.work1;

public class MyCalculate {
    public static double calcPi(int number) {
        Double pi=0.0;
        Double value=1.0;
        for(int i=0; i<number; i++)
        {
            if(i%2==0) {
                pi += 4/value;
            } else {
                pi -= 4/value;
            }
            value +=2;
        }
        return pi;
    }
}
