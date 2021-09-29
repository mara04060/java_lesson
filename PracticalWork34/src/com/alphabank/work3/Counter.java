package com.alphabank.work3;

public class Counter implements Runnable {
    private volatile Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run(){
        this.storage.setVariable(this.storage.getVariable() + 1);
    }



}
