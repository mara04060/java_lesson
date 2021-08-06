package com.alphabank.work2;

import java.util.Scanner;

public class Runner {
    public void run(){

        System.out.printf("Select type figure: Triangle, Circle, Rectangle:_");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        Shape[] arrShape = {
                new Triangle("Black", 12.3,8.01,9.7),
                new Triangle("White", 10,6,7),
                new Triangle("Black", 5,5,5),
                new Triangle("Black", 8,5,5),
                new Circle("White", 8.0),
                new Circle("Blac", 8.0),
                new Circle("Gray", 5.0),
                new Rectangle("RED", 12.2,3.0),
                new Rectangle("White", 10.01,10.01),
                new Rectangle("Gray", 8.01,12.0)
        };
       viewShape(arrShape);
       System.out.printf("Суммарная площадь всех фигур = %.2f", allArea(arrShape));
        System.out.println("\r");
       System.out.printf("Сумма фигур "+ type + " составляет = %.2f", allArea(arrShape, type));
    }

    public void viewShape(Shape[] arrShape){
        for (Shape shape: arrShape) {
            System.out.println(shape);
        }
    }

    public double allArea(Shape[] obj){
        double sumArea=0.0;
        for (Shape area: obj) {
            sumArea+= area.calcArea();
        }
        return sumArea;
    }

    public double allArea(Shape[] obj, String type){
        double sumArea = 0.0;
        for(Shape area: obj) {
            if(type.equals(area.getClass().getSimpleName())){
                sumArea += area.calcArea();
            }
        }
        return sumArea;
    }


}
