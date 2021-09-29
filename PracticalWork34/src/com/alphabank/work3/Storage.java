package com.alphabank.work3;

public class Storage {
    private volatile int variable;

    public Storage(){
        variable = 0;
    }

    public int getVariable() {
        return variable;
    }

    public void setVariable(int var) {
        variable = var;
    }

}
