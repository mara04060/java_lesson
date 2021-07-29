package com.alphabank.work3;

import java.util.Random;

public class ID {
    private int id;
    private static int nextID;

    static {
        setNextID();
    }

    public ID(){
        id = nextID;
        nextID++;
    }

    public int getID(){
        return id;
    }

    public static int getNextID(){
        return nextID;
    }

    private static void setNextID(){
//        nextID = (int)(Math.random()*100) +1;
        //сказали только Random & nextInt
        nextID = new Random().nextInt(100) + 1;
    }

}
