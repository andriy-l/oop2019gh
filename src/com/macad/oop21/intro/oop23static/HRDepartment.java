package com.macad.oop21.intro.oop23static;

public class HRDepartment {
    public static void main(String[] args) {
        Employee employee1 = new Employee("a", "b", "java", "555");
        Employee employee2 = new Employee("d", "c", "c++", "1555");
        Employee employee3 = new Employee("e", "f", "perl", "455");
        System.out.println(Employee.numberOfEmployees);
    }
}
