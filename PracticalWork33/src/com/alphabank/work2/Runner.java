package com.alphabank.work2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Runner {
    public void run(){

        Integer[] array = arrayInt(20);
        System.out.println(Arrays.toString(array));
        System.out.println("Сумма четных чисел: " + sumEven(array, x -> x % 2 == 0));
        System.out.println("Сумма только отрицательных: " + sumEven(array, x -> x < 0));
        Integer ss = Arrays.stream(array).filter(x -> x%2 == 0 && x > 0).reduce( (x, y) -> x + y ).get();
        System.out.println("Тоже - но стримами: " + ss);
    }

    private int generateArray(){
        return 50 - ( new Random().nextInt(100));
    }

    private Integer[] arrayInt(int size){
        Integer[] array = new Integer[size];
        for (int i=0; i<size; i++) {
            array[i] = generateArray();
        }
        return array;
    }

    public Integer sumEven(Integer[] arrInt, Predicate<Integer> predicate){
        Integer sum = 0;
        for (Integer elem : arrInt) {
            if (predicate.test(elem)) {
                sum += elem;
            }
        }
        return sum;
    }

    public void printStr(List<String > list, Predicate<String> predicate) {
        for (String str : list) {
            if (predicate.test(str)) {
                System.out.print(str + ", ");
            }
        }
    }
}
