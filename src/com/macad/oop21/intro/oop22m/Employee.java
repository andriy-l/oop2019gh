package com.macad.oop21.intro.oop22m;

public class Employee {
    public double calcSalary(String name, int bonus, double...salaries) {
        double totalSalary = 0;
        for (double salary : salaries) {
            totalSalary += salary;
        }

        if (totalSalary > 20) {
            bonus++;
        }
        System.out.printf("Employee %s has salary= %.2f \n", name, totalSalary);
        System.out.println("Employee " + name + " has salary= " + totalSalary);
        return totalSalary;
    }
}
