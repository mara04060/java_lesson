package com.alphabank.work3;

public abstract class Shape implements Draw,Comparable,Cloneable {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calcArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static Shape parseShape(String str) {
        String nameShape = str.split(":")[0];
        switch (nameShape) {
            case "Rectangle":
                    return Rectangle.parseRectangle(str);
            case "Circle":
                    return Circle.parseCircle(str);
            case "Triangle":
                    return Triangle.parseTriangle(str);
            default: return null;
        }
    }



    @Override
    public String toString(){
        return "class=" + getClass().getSimpleName() +
                ": color=" +color;
    }
    @Override
    public void draw() {
        System.out.println(this +", Area=" +calcArea());
    }

    @Override
    public int compareTo(Object obj) {
        if (this.calcArea() > ((Shape) obj).calcArea()) return 1;
        if (this.calcArea() < ((Shape) obj).calcArea()) return -1;
//        В одну строку вычитанием
//        return (int)((this.calcArea()-((Shape) obj).calcArea())) * 100);
        return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void printShape(Shape[] shapes){
        for (Shape shape: shapes) {
            shape.draw();
        }
    }

}
