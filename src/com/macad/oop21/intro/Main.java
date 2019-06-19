package com.macad.oop21.intro;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Створили екземпляр класу CorporateActivity
        // тип даних      екземляр   ініціалізація, виділення пам'яті
        //                               конструктор класу
        CorporateActivity subotnyk = new CorporateActivity();
        // ініцілізував поле (властивість) класу, який задає назву активності
        subotnyk.activityName = "Прибирання";

        CorporateActivity corporatyv = new CorporateActivity();
        corporatyv.activityName = "КАрпаратІв";

        Person boss = new Person();
        boss = new Person("Іван", "Васильович", 50, true);
        boss.enrollToActivity();

        Person employee = new Person("Петро", "Васильків", 41, true);
//        System.out.println(employee);

        employee.enrollToActivity();
        Person newEmployee = new Person();

        Person[] persons = new Person[5];

        persons[0] = null;
        persons[1] = boss;
        persons[2] = employee;
        persons[3] = new Person();
        persons[4] = newEmployee;

        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == null)
                continue;
            int currentAge = persons[i].getAgeOfAPerson();
            int newAge = (int)(currentAge * 0.1) + currentAge;
            persons[i].setAgeOfAPerson(newAge);
        }

        for (Person person : persons) {
            if (Objects.isNull(person)) {
                continue;
            }
            person.view();
        }

    }
}
