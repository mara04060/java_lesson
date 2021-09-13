package com.alphabank.work2;

import java.io.*;

public class Runner {
    private File file = new File(".\\resource\\user.txt");
    public void run() {
        User first = new User("Ivanov", "Ivan", 29);
        User two = new User("Petrov", "Oleg", 23);
        User noname = new User();

        writeUser(first);
        System.out.println("---------Read to File- one------------");


        writeUser(two);
        System.out.println("---------Read to File- two------------");


        writeUser(noname);
        System.out.println("---------Read to File- NoName------------");
        readUser() ;
    }

    public void writeUser (User user) {
        try (RandomAccessFile out = new RandomAccessFile(file, "rw")) {
            long endPointFile = out.length();
            out.seek(endPointFile);
            out.writeBytes(user.toString() + "\n");
        } catch (IOException exp) {
        }

    }

    public void readUser() {
        try(RandomAccessFile in = new RandomAccessFile(file, "r")) {
            String line;
            while ((line = in.readLine() ) != null ) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Общая ошибка ввода-вывода.");
        }

    }
}
