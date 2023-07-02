package ru.geekbrains.hw4.View;

import ru.geekbrains.hw4.Model.Order;

import java.util.Scanner;

public class View {

    public static void printOrders(Order[] orders) {
        System.out.printf("%-20s |     %-20s |     %-12s |     %-12s |     %-12s |     %s\n", "Phone", "Product",
                "Amount", "Total_price", "Discount", "Total with discount");
        System.out.println(
                "____________________________________________________________________________________________________________________________________\n");

        for (Order order : orders) {
            if (order != null) {
                System.out.println(order);
            }
        }
    }

    public static void printCountOrders(Order[] orders) {
        int count = 0;

        System.out.println(
                "____________________________________________________________________________________________________________________________________\n");

        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null) {
                count++;
            }
        }

        System.out.println("Количество покупок = " + count);
        System.out.println(
                "____________________________________________________________________________________________________________________________________\n");
    }

    public static String requestPhone() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер телефона: ");
        String phone = scanner.nextLine();

        return phone;
    }

    public static String requestProductTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите наименование товара: ");
        String productTitle = scanner.nextLine();

        return productTitle;
    }
}