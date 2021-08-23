package com.alphabank.work3;


public class MyTestClass {
    private String field = "Field in MyTestClass";
    public void test(){
        System.out.println("Метод Тест класс MyTestClass");
    }


    public void getStatInOutClass(){
        System.out.println( "Из верх класса к стат классу и его полю: " + MyStaticNested.field);
        MyStaticNested.test();
        MyStaticNested.getInnerInStatClass();
    }

    static class MyStaticNested {
        private static String field = "Field Static class";
        static void test(){
            System.out.println("Метод тест стат класса и поле field="+field);
        }
        static void getInnerInStatClass() {
            MyTestClass outerClass = new MyTestClass();
            System.out.println("Из стат класса поле Верх класса " + outerClass.field);
            outerClass.test();
        }
    }

    class MyInner {
        private String field = "Field in InnerClass";
        void test(){
            System.out.println("It's a Inner Class и поле Field=" + field);
        }
        void getLocalclass(){
            myLocal();
        }

    }

    void myLocal(){
        System.out.println("Запущен метод внутри которого Локальный класс");
        class MyLocal {
            private String field = "Field in Local class";
            void test(){
                System.out.println("Внутри локального класса сработал метод : " + field );
            }
        }
        MyLocal myLocal = new MyLocal();
        myLocal.test();
        System.out.println("Из Метода вызываем локальное поле Field="+myLocal.field);
    }



}
