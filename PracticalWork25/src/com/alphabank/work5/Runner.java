package com.alphabank.work5;

public class Runner {

    public void run(){

        Shape[] allShape = {
            Shape.parseShape("Circle:RED:10.5"),
            Shape.parseShape("Circle:GRAY:1"),
            Shape.parseShape("Circle:CIAN:7.8"),
            Shape.parseShape("Rectangle:BLACK:5.5,5.5"),
            Shape.parseShape("Rectangle:WHITE:8,20"),
            Shape.parseShape("Rectangle:BROWN:12,2.9"),

            Triangle.parseTriangle("Triangle:BLACK:14,20,14"),
            Circle.parseCircle("Circle:WHITE:17"),
            Rectangle.parseRectangle("Rectangle:YELLOW:4.6,7.8")
        };
      Shape.printShape(allShape);
    }
}
