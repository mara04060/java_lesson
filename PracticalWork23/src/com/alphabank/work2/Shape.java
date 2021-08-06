package com.alphabank.work2;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Double calcArea(){
        return 0.0;
    }

    @Override
    public String toString(){
        return "class=" + getClass().getSimpleName() +
                ": color=" +color;
    }
}
