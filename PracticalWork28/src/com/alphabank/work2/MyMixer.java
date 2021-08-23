package com.alphabank.work2;

import java.util.Random;

public class MyMixer<T> {
    private T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void shuflle() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int index = random.nextInt(array.length);
            T temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
