package com.alphabank.work3;

import java.util.Random;

public class ID {
    private int id;
    private static int nextID;

    static {
//        Разово генерит случаянное число nextID и все...
        setNextID();
    }

    public ID(){
        id = nextID +1;
    }

    public void setID(int id){
        this.id = id;
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
        nextID = new Random(1).nextInt(100);
    }

}
