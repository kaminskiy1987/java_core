package ru.geekbrains.hw3;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Mikhail", "Ivanov", "manager", 32, 500, 8952222222L);
        Employee employee2 = new Employee("Petr", "Petrov", "assistant", 30, 1500, 8953425333L);
        Employee employee3 = new Boss("Sidor", "Sidorov", "Boss", 31, 4000, 89521241555L);

        Employee[] employees = new Employee[]{employee1, employee2, employee3};

        for (Employee e : employees) {
            System.out.println(e);
        }

        Boss.getSalaryBoss(employees);
        System.out.println();

        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println();

        if (new ComparatorForAge().compare(employee1, employee2) == -1) {
            System.out.println(employee1.getFirstName() + " младше");
        } else if (new ComparatorForAge().compare(employee1, employee2) == 1) {
            System.out.println(employee1.getFirstName() + " старше");
        } else{
            System.out.println("одного возраста");
        }
    }
}


