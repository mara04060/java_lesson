package com.alphabank.work2;
import java.util.*;

public class Runner {
    public static void run() {

        MyNumGenerator numGenerator = new MyNumGenerator(15, 10);

        List<Integer> integerList = numGenerator.generateList();
        System.out.println(integerList);

        Set<Integer> integerSet = numGenerator.generateSet();
        System.out.println(integerSet);

    }
}
