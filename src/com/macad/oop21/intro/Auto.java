package com.macad.oop21.intro;

import java.util.Objects;

public class Auto {
    private String number;
    private Person owner;

    public void setNumber(String number) {
        if (!number.contains("SN")) {
            throw new IllegalArgumentException("Invalid auto number");
        }

        this.number = number;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getNumber() {
        return this.number;
    }

    public Person getOwner() {
        return this.owner;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "number='" + number + '\'' +
                ", owner=" + owner +
                '}';
    }
}
