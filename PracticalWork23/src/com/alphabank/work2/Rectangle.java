package com.alphabank.work2;

public class Rectangle extends Shape {
    private Double width;
    private Double height;

    public Rectangle(String color, Double width, Double height) {
        super(color);
        if(width>0 && height>0) {
            this.width = width;
            this.height = height;
        }
    }

    @Override
    public Double calcArea() {
        return (double)(int)((height * width)*100)/100;
    }

    @Override
    public String toString() {
        return super.toString()+", Widht="+ width +
                ", Height=" +height+
                ", Area="+calcArea();
    }
}
