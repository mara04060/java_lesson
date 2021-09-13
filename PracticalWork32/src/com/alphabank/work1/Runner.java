package com.alphabank.work1;

import com.alphabank.work1.Employee;

import java.io.*;

public class Runner {
    private File file = new File(".\\resource\\emp.ser");
    public void run() {
        Employee employee = new Employee("Ivan", "av. Shostak, 11", 20210001, 12);
        writeEmployee(employee);
        System.out.println( readEmployee() );
    }

    public void writeEmployee(Employee employee) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(employee);
            System.out.println("Write Full Success!");
        } catch (IOException exp) {}
    }

    public Employee readEmployee() {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            return (Employee) in.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("First print...");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Two print ...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Three print ...");
        }
        return null;
    }
}
