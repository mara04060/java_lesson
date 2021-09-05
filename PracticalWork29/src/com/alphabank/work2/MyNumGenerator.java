package com.alphabank.work2;

import java.util.*;

public class MyNumGenerator {
    private int numOfElem;
    private int maxValue;
    private Random random = new Random();

    public MyNumGenerator(int numOfElem, int maxValue) {
        this.numOfElem = numOfElem;
        this.maxValue = maxValue;
    }

    public List<Integer> generateList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numOfElem; i++) {
            list.add(random.nextInt(maxValue));
        }
        return list;
    }

    public Set<Integer> generateSet() {
        if (numOfElem > maxValue) {
            throw new ArithmeticException("Not correct set! Please edit value numOfElem=" +numOfElem + " and/or value maxValue = "+maxValue);
        }
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < numOfElem; i++) {
            if ( !integerSet.add(random.nextInt(maxValue))) {
                i--;
            }
        }
        return integerSet;
    }
}
