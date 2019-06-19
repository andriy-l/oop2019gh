package com.macad.oop21.intro;

public class Person {
    // властивості класу, задаються полями класу:
    private String firstName;
    private String lastName;
    private int ageOfAPerson;
    private boolean married;

    private Auto auto;

    /**
    default constructor
     */
    public Person() {
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param ageOfAPerson
     * @param married
     */
    public Person(String firstName, String lastName, int ageOfAPerson, boolean married) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ageOfAPerson = ageOfAPerson;
        this.married = married;
    }

    // поведінка

    /**
     * метод, який
     */
    public void enrollToActivity() {
        System.out.println(firstName + " " + lastName + " підписався на ...");
    }

    /**
     * Metho for activity enrollment
     * @param corporateActivity
     */
    public void enrollToActivity(CorporateActivity corporateActivity) {
        System.out.println(firstName + " " + lastName + " підписався на ...");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAgeOfAPerson() {
        return ageOfAPerson;
    }

    public boolean isMarried() {
        return married;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAgeOfAPerson(int ageOfAPerson) {
        this.ageOfAPerson = ageOfAPerson;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ageOfAPerson=" + ageOfAPerson +
                ", married=" + married +
                '}';
    }

    public void view() {
        System.out.println(this.toString());
    }
}
