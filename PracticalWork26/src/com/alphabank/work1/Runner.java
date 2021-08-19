package com.alphabank.work1;

public class Runner {

    public void run() {
        try {
        System.out.println( devisionInt(10, 0) );
        } catch (ArithmeticException e) {
            System.out.println("произошло исключение и деление на 0 -" + e.getMessage());
        }

        try {
            System.out.println( devisionDouble(12.0 , 0) );
        } catch (ArithmeticException e) {
            System.out.println("произошло исключение и деление на 0 -" + e.getMessage());
        }

    }



    public int devisionInt(int a, int b) throws ArithmeticException {
            return (int)(a/b);
    }

    public double devisionDouble(double a, double b) throws ArithmeticException {
        if(b == 0.0 ) {
            throw new ArithmeticException("деление на 0 Double");
        }
        return  a/b;

    }
}
