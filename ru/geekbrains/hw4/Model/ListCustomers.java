package ru.geekbrains.hw4.Model;

import java.util.LinkedList;

public class ListCustomers {
    private LinkedList<Customer> listCustomer = new LinkedList<>();

    public ListCustomers(Customer... customers) {
        for (Customer cust : customers) {
            listCustomer.add(cust);
        }
    }

    public LinkedList<Customer> getListCustomer() {
        return listCustomer;
    }
}