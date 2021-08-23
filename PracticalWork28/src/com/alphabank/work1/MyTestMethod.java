package com.alphabank.work1;


public class MyTestMethod {
    public static <N extends Number> int calcNum(N[] array, N maxValue) {
        int counter = 0;
        for (N element : array) {
            if (element.doubleValue() > maxValue.doubleValue()) {
                counter++;
            }
        }
        return counter;
    }

    public static <N extends Number> double calcSum(N[] array, N maxValue) {
        double sum = 0.0;
        for (N element : array) {
            if (element.doubleValue() > maxValue.doubleValue()) {
                sum += element.doubleValue();
            }
        }
        return sum;
    }
}
