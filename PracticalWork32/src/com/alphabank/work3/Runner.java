package com.alphabank.work3;

import java.io.*;


public class Runner {
    private File file = new File(".\\resource\\user.ser");

    /**
     * Происходит перезапись данных в один файл
     * @throws IOException
     */
    public void run() throws IOException {

//        User first = new User("Ivanov", "Ivan", 29);
//        externalSerialize(first, file);
//        User two = new User("Petrov", "Oleg", 23);
//        externalSerialize(two, file);
//        User noname = new User();
//        externalSerialize(noname, file);


        User[] arrUser = {
                new User("Ivanova", "Ivanna", 28),
                new User("Petrova", "Victory", 22),
                new User()
        };

        externalSerializeArray(arrUser, file);
        printExtSer(file);
    }


    private void externalSerialize(User writeUser, File filePath) throws IOException {
        try (ObjectOutputStream objOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objOutputStream.writeObject(writeUser);
        }
    }

    private void printExtSer(File filePath) throws IOException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            User user;
            while ((user = (User) objectInputStream.readObject()) != null) {
                System.out.println(user);
            }

        } catch (ClassNotFoundException | EOFException e) {
//            e.printStackTrace();
        }
    }

    private void externalSerializeArray(User[] wUsers, File filePath) throws IOException {
        try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(filePath))) {
            for (User user : wUsers) {
                obj.writeObject(user);
            }
        }
    }


}
