package com.alphabank.work2;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        if( (a+b>c || a+c>b || c+b>a) && a>0 && b>0 && c>0){
            this.a = a;
            this.b = b;
            this.c = c;
        }

    }

    @Override
    public Double calcArea(){
        double p = (a+b+c)/2;
        return (double)(int)((Math.sqrt(p*(p-a)*(p-b)*(p-c)))*100)/100;
    }

    @Override
    public String toString(){
        return super.toString()+", a="+ a +
                ", b=" +b+
                ", c="+c+
                ", Area="+calcArea();
    }
}
