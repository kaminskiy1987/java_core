package ru.geekbrains.hw4;

import ru.geekbrains.hw4.Model.*;
import ru.geekbrains.hw4.Service.ShopService;
import ru.geekbrains.hw4.View.View;

public class Controller {
    private ListCustomers listCustomers = new ListCustomers(
            new Customer("Ivan", "Ivanov", 25, "+79104326600"),
            new Customer("Petr", "Petrov", 25, "+79102323611"));

    private ListProducts listProducts = new ListProducts(
            new Product("Milk", 100),
            new Product("Bread", 70.5f),
            new Product("Meat", 1008.7f),
            new Product("Chocolate", 225.6f),
            new Product("Tea", 300));

    private ShopService shopService = new ShopService(listCustomers, listProducts);

    private void orders() {
        Order[] orders = shopService.userOrders();

        View.printOrders(orders);
        View.printCountOrders(orders);
    }

    public static void buttonClick() {
        Controller conrtol = new Controller();
        conrtol.orders();
    }
}