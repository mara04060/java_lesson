package com.alphabank.work3;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) throws InvalidShapeStringException{
        super(color);
        if(width>0 && height>0) {
            this.width = width;
            this.height = height;
        } else {
            throw new InvalidShapeStringException("Ошибка создания прямоугольника");
        }
    }

    public static Rectangle parseRectangle(String str) {
        String color = str.split(":")[1];
        String whString = str.split(":")[2];
        ///Можно выполнить двойной парсинг сразу например:
//        Array whArray = str.split([:,]);
//        ///  тогда сразу распарсит и последние элементы длинны
//        ///  и ширины в общий массив
//        double width = Double.parseDouble(whArray[2]);
//        double height = Double.parseDouble(whArray[3];
        double width = Double.parseDouble(whString.split(",")[0]);
        double height = Double.parseDouble(whString.split(",")[1]);
        return new Rectangle(color, width, height);
    }


    @Override
    public double calcArea() {
        return (double)(int)((height * width)*100)/100;
    }

    @Override
    public String toString() {
        return super.toString()+", Widht="+ width +
                ", Height=" +height;
    }

}
