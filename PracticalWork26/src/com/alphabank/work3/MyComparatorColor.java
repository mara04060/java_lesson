package com.alphabank.work3;
import java.util.Comparator;

public class MyComparatorColor implements Comparator {

    @Override
    public int compare(Object objA, Object objB) {
        String colorA = ((Shape) objA).getColor();
        String colorB = ((Shape) objB).getColor();
        return colorA.compareTo(colorB);
    }

}
