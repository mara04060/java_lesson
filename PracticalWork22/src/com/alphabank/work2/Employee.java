package com.alphabank.work2;

public class Employee {
    private String firstName;
    private String lastName;
    private String occupation;
    private String telephone;
    private static int numberOfEmployees = 0;

    {
        numberOfEmployees++;
    }


    public Employee() {
        this("Name", "LastName","Director","+38060");
    }

    public Employee(String firstName, String lastName, String occupation, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
//        numberOfEmployees++; ///
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getTelephone() {
        return telephone;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
