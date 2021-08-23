package com.alphabank.work2;

import java.util.Arrays;

public class Runner {
    public void run() {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        MyMixer<Integer> mixer = new MyMixer<>(intArray);
        MyMixer<?> mixer = new MyMixer<>(intArray);
        mixer.shuflle();
        intArray = (Integer[]) mixer.getArray();
        System.out.println(Arrays.toString(intArray));

        String[] strArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
//        MyMixer<String> myMixer = new MyMixer<>(strArray);
//        myMixer.shuflle();
//        strArray = myMixer.getArray();
        mixer = new MyMixer<>(strArray);
        mixer.shuflle();
        strArray = (String[]) mixer.getArray();
        System.out.println(Arrays.toString(strArray));
    }
}
