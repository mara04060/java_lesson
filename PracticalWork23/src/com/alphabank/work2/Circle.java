package com.alphabank.work2;

public class Circle extends Shape{
    private Double radius;

    public Circle(String color, Double radius) {
        super(color);
        if(radius>0) {
            this.radius = radius;
        }
    }

    @Override
    public String toString(){
        return super.toString()+", radius="+ radius +
                ", Area=" +calcArea();
    }

    @Override
    public Double calcArea(){
        return (double)(int)((radius * radius * 2 * Math.PI)*100)/100;
    }

}
