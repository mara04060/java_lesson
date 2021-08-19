package com.alphabank.work3;

public class Runner {

    public void run() {

        try{
            System.out.println( Rectangle.parseRectangle("Rectangle:YELLOW:4.6,-7.8") );
        } catch (InvalidShapeStringException e){
            System.err.println(e.getMessage());
        }

        try{
            System.out.println( Shape.parseShape("Circle:GRAY:-1") );
        } catch (InvalidShapeStringException e){
            System.err.println(e.getMessage());
        }

        try{
            System.out.println( Triangle.parseTriangle("Triangle:BLACK:14,-20,14") );
        } catch (InvalidShapeStringException e){
            System.err.println(e.getMessage());
        }


        try{
            System.out.println( Triangle.parseTriangle("Triangle:BLACK:14,20,14") );
        } catch (InvalidShapeStringException e){
            System.err.println(e.getMessage());
        }


    }



}
