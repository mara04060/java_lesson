package com.alphabank.work6;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Runner {
    public void run() {
        Integer[] array = createArray();
//        System.out.println(Arrays.toString(array));
        RecursiveTask<Integer> task = new RecSum(array, 0, array.length - 1);
        ForkJoinPool pool = new ForkJoinPool(4);
        Integer res = pool.invoke(task);
        System.out.println("Sum = " + res);
    }

    public Integer[] createArray() {
        Random random = new Random(100);
        Integer[] array = new Integer[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }
}
