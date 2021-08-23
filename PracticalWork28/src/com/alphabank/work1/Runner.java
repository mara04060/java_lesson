package com.alphabank.work1;

public class Runner {
    public void run(){
        Integer[] intArr = {34, -98, 0, 12, 20, -76, 1, -1, 50};
        System.out.println("Count int = " + MyTestMethod.calcNum(intArr, 0));
//        String[] strArr = {"1", "-2", "2"};
//        System.out.println("Sum = " + MyTestMethod.calcNum(strArr, "0"));

        System.out.println("Count double = "
                + MyTestMethod.calcNum(new Double[] {1.0, 2.0, -3.0, 5.0, -8.0}, 0.0));

        System.out.println("сумма int -> " + MyTestMethod.calcSum(intArr, 15));
        System.out.println("сумма double -> "
                + MyTestMethod.calcSum(new Double[] {1.0, 2.0, -3.0, 5.0, -8.0}, 0.0));
    }
}
