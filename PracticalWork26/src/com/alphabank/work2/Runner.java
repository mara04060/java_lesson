package com.alphabank.work2;

public class Runner {
    public void run(){

        try {
            Person person1 = new Person();
            person1.setAge(0);
            person1.setFirstName("FirstName");
            person1.setLastName("LastName");
        } catch (InvalidAgeException e) {
            System.err.println( e.getMessage() );
        }

    }
}
