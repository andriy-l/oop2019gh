package com.macad.oop21.intro.oop23static;

public class Employee {
    private String firstName;
    private String lastName;
    private String occupation;
    private String telephone;
    public static long numberOfEmployees;

    public Employee(String firstName, String lastName, String occupation, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
        numberOfEmployees++;
    }
}
