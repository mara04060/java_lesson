package com.alphabank.work2;

public class Employee {
    private String firstName;
    private String lastName;
    private String occupation;
    private String telephone;
    private static int numberOfEmployees = 0;

    {
//        Вызывается столько раз сколько обьектов создается, каждый раз
//            при создании обьекта
        addNumberOfEmployees();
    }

    static {
//        Вызывается ПЕРВЫМ разово за все вызовы и создания всех обьектов
//          Ура человечество создано!!!
    }

    public Employee() {
//        Заполним человечка значениями по умолчанию
        setLastName("Last");
        setFirstName("Firstname");
        setOccupation("Ocuppation");
        setTelephone("not Phone");
    }

    public Employee(String family, String name, String occupation, String telephone){
        setFirstName(name);
        setLastName(family);
        setOccupation(occupation);
        setTelephone(telephone);
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

    /**
     * Если сделать этот метод общедоступным то можно не создавая
     * человека увеличивать рождаемость населения
     */
    private static void addNumberOfEmployees() {
        Employee.numberOfEmployees++;
    }
}
