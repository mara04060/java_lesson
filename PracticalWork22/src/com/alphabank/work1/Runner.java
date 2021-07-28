package com.alphabank.work1;

import com.alphabank.work2.Employee;
import com.alphabank.work3.ID;
import com.alphabank.work4.Calcarea;

import java.util.Scanner;

public class Runner {
    public void run() {
        int number = inputNumber();
        Double pi = MyCalculate.calcPi(number);
        System.out.println("Pi = "+pi);

        Employee objOneEmployee = new Employee();
        objOneEmployee.setFirstName("First Name");
        objOneEmployee.setLastName("Last Name");
//       Обращение к стат полю созданного обьекта
        System.out.println(" First Obj Number Of Employee = " + objOneEmployee.getNumberOfEmployees());

        Employee objTwoEmploee = new Employee();
        objTwoEmploee.setLastName("Второй несчасный");
        objTwoEmploee.setFirstName("Two Name");
//       Обращение к стат полю Второго созданного обьекта
        System.out.println(" Two Obj Number Of Employee = " + objTwoEmploee.getNumberOfEmployees());
//        Хотя можно обратится и к первому обьекту- он выведет такое-же число, т.к статик метод общий дл всех
        System.out.println(" First Obj Number Of Employee = " + objOneEmployee.getNumberOfEmployees());

//       Обращение к стат переменной класса - все это общедоступно
        System.out.println(" Three Obj Number Of Employee = " + Employee.getNumberOfEmployees());


//        Создам через конструктор человека без имени.
        Employee noName = new Employee();
//        счетчик УЖЕ увеличился
        System.out.println("Очередной чел уже = " + Employee.getNumberOfEmployees());
//        Создам человека с фамилией и всеми параметрами
        Employee fullName = new Employee("Фамилия", "Имя","Отчество","+380671234567");
        System.out.println("Очередной "+fullName.getFirstName()+"\t" + fullName.getLastName()+" по счету уже " + Employee.getNumberOfEmployees());


//        Cоздадим несколько обьектов ID
        ID objID_One = new ID();
        System.out.println("objID_One = "+ objID_One.getID());
        ID objID_Two = new ID();
        System.out.println("objID_Two = "+ objID_Two.getID());
        ID objID_Three = new ID();
        System.out.println("objID_One = "+ objID_Three.getID());
        System.out.println("nextID = "+ ID.getNextID());

//        Площадь круга:
        Calcarea objCalc = new Calcarea();
        double scircle = objCalc.areaCircle(12.34);
        int ssquare = objCalc.areaSquare(11);
        System.out.println("Площадь круга: "+scircle);
        System.out.println("Площадь квадрата:" +ssquare);
    }

    public int inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ввести количество итераций-> ");
        while (true) {
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number > 0) return number;
            } else {
                sc.next();
            }
            System.out.println("Ошибка ввода числа!!!\r\n введите корректное число:");
        }
    }
}
