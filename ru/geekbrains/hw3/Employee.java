package ru.geekbrains.hw3;

public class Employee {
    private String surName;
    private String firstName;
    private String position;
    private int age;
    private int salary;
    private Long phone;

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Employee(String surName, String firstName, String position, int age, int salary, Long phone) {
        this.surName = surName;
        this.firstName = firstName;
        this.position = position;
        this.age = age;
        this.salary = salary;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surName='" + this.surName + '\'' +
                ", firstName='" + this.firstName + '\'' +
                ", position='" + this.position + '\'' +
                ", age=" + this.age +
                ", salary=" + this.salary +
                ", phone=" + this.phone +
                '}';
    }
}