package com.alphabank.work3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class User implements Externalizable {
    private String firstName;
    private String lastName;
    private int age;

    public User() {
        this.firstName = "Default";
        this.lastName = "LastName";
        this.age = 1;
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName  +"\'"+
                ", lastName='" + lastName  +"\'"+
                ", age=" + age +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(firstName);
        objectOutput.writeObject(lastName);
        objectOutput.writeInt(age);

    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {

        this.firstName = (String) objectInput.readObject();
        this.lastName = (String) objectInput.readObject();
        this.age = objectInput.readInt();
    }
}
