package com.alphabank.work3;

public class Printer implements Runnable {
    private volatile Storage storage;
    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run(){
        System.out.println( "Var Storage = " + this.storage.getVariable() );
    }

}
