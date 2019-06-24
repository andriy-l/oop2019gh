package com.macad.oop21.intro.oop22m;

public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    int phoneNumber;

    public void setPerson(String firstName) {
        this.firstName = firstName;
    }

    public void setPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setPerson(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {
        Person petro = new Person();
        petro.setPerson("petro");
    }

}
