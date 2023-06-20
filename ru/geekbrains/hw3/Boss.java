package ru.geekbrains.hw3;

public class Boss extends Employee{
    public Boss(String surName, String firstName, String position, int age, int salary, Long phone) {
        super(surName, firstName, position, age, salary, phone);
    }

    public static void getSalaryBoss(Employee[] employees){
        for (int i = 0; i < employees.length; i++){
            if (!(employees[i] instanceof Boss)){
                employees[i].setSalary(employees[i].getSalary() + 9999);
            }
        }
    }
}