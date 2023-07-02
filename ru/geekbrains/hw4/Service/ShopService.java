package ru.geekbrains.hw4.Service;

import ru.geekbrains.hw4.Exceptions.AmountException;
import ru.geekbrains.hw4.Exceptions.CustomerException;
import ru.geekbrains.hw4.Exceptions.ProductException;
import ru.geekbrains.hw4.Model.*;
import ru.geekbrains.hw4.View.View;

import java.util.Random;

public class ShopService {
    private ListCustomers listCustomers;
    private ListProducts listProducts;

    public ShopService(ListCustomers listCustomers, ListProducts listProducts) {
        this.listCustomers = listCustomers;
        this.listProducts = listProducts;
    }

    public Order[] userOrders() {
        Order[] orders = new Order[5];
        Random random = new Random();

        for (int i = 0; i < orders.length; i++) {
            String phone = View.requestPhone();
            String title = View.requestProductTitle();

            try {
                orders[i] = makePurcher(phone, title, random.nextInt(-10, 120));
            } catch (ProductException prException) {
                System.out.println(prException.getMessage());
            } catch (AmountException amException) {
                System.out.println(amException.getMessage());

                try {
                    orders[i] = makePurcher(phone, title, 1);
                } catch (ProductException prException) {
                    System.out.println(prException.getMessage());
                } catch (AmountException amountException) {
                    System.out.println(amountException.getMessage());
                } catch (CustomerException custException) {
                    System.out.println(custException.getMessage());
                }
            } catch (CustomerException custException) {
                System.out.println(custException.getMessage());
            }
        }

        return orders;
    }

    private Order makePurcher(String phone, String title, int amount)
            throws CustomerException, ProductException, AmountException {
        Customer customer = null;
        Product product = null;

        for (Customer custom : listCustomers.getListCustomer()) {
            if (custom.getPhone().equals(phone)) {
                customer = custom;
            }
        }

        for (Product prod : listProducts.getListProduct()) {
            if (prod.getTitle().equals(title)) {
                product = prod;
            }
        }

        if (customer == null) {
            throw new CustomerException("Customer not found");
        }

        if (product == null) {
            throw new ProductException("Product not found");
        }

        if ((amount > 100) || (amount < 1)) {
            throw new AmountException("Amount is not corrected");
        }
        return new Order(customer, product, amount);
    }
}