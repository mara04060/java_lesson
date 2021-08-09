package com.alphabank.work;
import java.util.Arrays;

public class Runner {
    public void run() throws Exception {


        Shape[] arrShape = {
                new Triangle("Gray", 12.3,8.01,9.7),
                new Triangle("White", 10,6,7),
                new Rectangle("White", 10.01,10.01),
                new Triangle("Black", 80,50,55),
                new Circle("White", 8.0),
                new Circle("Black", 8.0),
                new Triangle("Cyan", 5,5,5),
                new Circle("Gray", 5.0),
                new Rectangle("RED", 12.2,3.0),
                new Rectangle("Gray", 80.01,12.0)
        };
        viewShape(arrShape);
        System.out.println("\n----Упорядоченный массив----------\n");
        Arrays.sort(arrShape);
        viewShape(arrShape);

        System.out.println("\n----Сортируем по цвету----------\n");
        Arrays.sort(arrShape, new MyComparatorColor());
        viewShape(arrShape);
        Triangle myNewShape = new Triangle("LightGray", 12,30, 20);
        Triangle cloneMyTriangle = (Triangle) myNewShape.clone();
        System.out.println("\r\nДва клона треугольника:");
        Shape[] myArrayShape = {
                cloneMyTriangle, myNewShape
        };
        viewShape(myArrayShape);
        //        В новой копии поменяю цвет
        cloneMyTriangle.setColor("Orange");
        System.out.println("\r\nМеняю в одном цвет на Оранжевый:");
        viewShape(myArrayShape);
    }

    /**
     * отображение любой фигуры в таблице
     * @param arrShape
     */
    public void viewShape(Shape[] arrShape){
        for (Shape shape: arrShape) {
            shape.draw();
        }
    }

    /**
     * Cумма всех обьектов фигур
     * @param obj
     * @return
     */
    public double allArea(Shape[] obj){
        double sumArea=0.0;
        for (Shape area: obj) {
            sumArea+= area.calcArea();
        }
        return sumArea;
    }

    /**
     * Сумма определленного вида фигур type
     * @param obj
     * @param type
     * @return
     */
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
