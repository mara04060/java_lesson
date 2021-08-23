package com.alphabank.work2;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhone {
    //Или делать это поле Доступным Public и не создавать метод getPhoneBook
    //Или дать Public и не морочиться? Достоинства и недостатки этого?
    private MyPhoneBook phoneBook;

    public MyPhone() {
        phoneBook = new MyPhoneBook();
    }

    public MyPhoneBook getPhoneBook(){
        return this.phoneBook;
    }
    public void swichOn(){
        System.out.println("Loading PhoneBook records…");

        phoneBook.addPhoneNumber("Ivan", "0971234567");
        phoneBook.addPhoneNumber("Mariia", "0689876543");
        phoneBook.addPhoneNumber("Ievgen", "0501827345");
        phoneBook.addPhoneNumber("Dron", "0500828340");
        phoneBook.addPhoneNumber("BootFather", "0504569082");
        phoneBook.addPhoneNumber("Svitlana", "0975643287");
        phoneBook.addPhoneNumber("Dronk", "0509828340");

        System.out.println("Loading is complete - ");
    }

    public void call(int numCall){
        System.out.println("Yours calling in "+ phoneBook.records[numCall]);
        System.out.println("Calling to "+phoneBook.records[numCall].phone + " ...");
    }

    public class MyPhoneBook {
        private PhoneRecord[] records;
        private int counter = 0;

        public MyPhoneBook() {
            records = new PhoneRecord[10];
        }

        public boolean addPhoneNumber(String name, String phone) {
            if (counter == records.length) return false;
            records[counter] = new PhoneRecord(name, phone);
            counter++;
            return true;
        }

        public String printPhoneBook() {
            if (counter == 0) {
                return "No records!";
            }
            return convertRecordsToString(Arrays.copyOf(records, counter));
        }

        private String convertRecordsToString(PhoneRecord[] myRecords) {
            StringBuilder temp = new StringBuilder();
            for (PhoneRecord element : myRecords) {
                temp.append(element + "\n");
            }
            return temp.toString();
        }

        public String sortByName() {
            PhoneRecord[] temp = Arrays.copyOf(records, counter);
            Arrays.sort(temp, new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    String name1 = ( (PhoneRecord)o1).name;
                    String name2 = ( (PhoneRecord)o2).name;
                    return name1.compareTo(name2);
                }
            });
            return convertRecordsToString(temp);
        }

        class PhoneRecord {
            private String name;
            private String phone;

            public PhoneRecord(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            public String getName() {
                return name;
            }
            public String getPhone() {
                return phone;
            }

            @Override
            public String toString() {
                return "name=" + name +
                        ", phone=" + phone ;
            }
        }
    }

    public class PowerOnButton {

    }

    public class PhoneDisplay{

    }

    public class PhoneSpeaker{

    }
}
