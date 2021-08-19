package com.alphabank.work3;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) throws InvalidShapeStringException{
        super(color);
        if( (a+b>c && a+c>b && c+b>a) && a>0 && b>0 && c>0){
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new InvalidShapeStringException("Ошибка создания треугольника");
        }
    }

    public static Triangle parseTriangle(String str) {
        String color = str.split(":")[1].toString();
        String abcString = str.split(":")[2].toString();
        double a = Double.parseDouble(abcString.split(",")[0]);
        double b = Double.parseDouble(abcString.split(",")[1]);
        double c = Double.parseDouble(abcString.split(",")[2]);
//        System.out.println(" Triangle = " + a + b + c);
        return new Triangle(color, a, b, c);
    }

    @Override
    public double calcArea(){
        double p = (a+b+c)/2;
        return (double)(int)((Math.sqrt(p*(p-a)*(p-b)*(p-c)))*100)/100;
    }

    @Override
    public String toString(){
        return super.toString()+", a="+ a +
                ", b=" +b+
                ", c=" +c;
    }

}
