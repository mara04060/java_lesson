package com.alphabank.work3;

public class Runner {
    private MyTestClass testClass;

    public void run() {
//        Обращение к Static методам из верхнего класса
        System.out.println("----Обращение сразу к стат методам и свойствам: ---");
        MyTestClass.MyStaticNested.getInnerInStatClass();

        MyTestClass test = new MyTestClass();

//        обращение к методам и свойствам из стат класса
        System.out.println("----Из Внешнего класса к его свойствам и методам:----");
        test.getStatInOutClass();

//        Обращение к внутреннему классу
        System.out.println("---Внутренний класс----");
        MyTestClass.MyInner myInner = test.new MyInner();
        myInner.test();
        myInner.getLocalclass();

//        Обращение к локальному классу
        System.out.println("----Локальный класс -----");
        test.myLocal();
    }
}
