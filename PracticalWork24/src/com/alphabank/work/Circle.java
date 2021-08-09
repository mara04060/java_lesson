package com.alphabank.work;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, Double radius) {
        super(color);
        if(radius>0) {
            this.radius = radius;
        }
    }

    @Override
    public String toString(){
        return super.toString()+", radius="+ radius;
    }

    @Override
    public double calcArea(){
        return (double)(int)((radius * radius * 2 * Math.PI)*100)/100;
    }



}
