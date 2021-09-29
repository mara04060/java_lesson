package com.alphabank.work2;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public void run() {
        Integer[] array = Stream.generate( () -> new Random().nextInt(1000))
                .limit(100)
                .collect(Collectors.toList()).toArray(new Integer[] { });
        System.out.println(Arrays.toString(array));

//        Thread thread = new MySumCount_1(0, 5, array);
//        thread.start();
//        try {
//            thread.join();
//        } catch (InterruptedException e) { }
//        System.out.println("Sum = " + ((MySumCount_1)thread).getResultSum());

//        Runnable myRun = new MySumCount_2(0, 5, array);
//        Thread thread1 = new Thread(myRun);
//        thread1.start();
//        try {
//            thread1.join();
//        } catch (InterruptedException e) { }
//        System.out.println("Sum = " + ((MySumCount_2)myRun).getResultSum());

        int startIndex = 0;
        int stopIndex = 5;
        Callable<Integer> myThread = () -> {
            Integer resultSum = 0;
            for (int i = startIndex; i <= stopIndex; i++) {
                resultSum += array[i];
            }
            return resultSum;
        };
        Future<Integer> future = new FutureTask<>(myThread);
        new Thread((FutureTask<Integer>)future).start();
        try {
            System.out.println("Sum = " + future.get());
        } catch (InterruptedException | ExecutionException e) {  }
    }
}
