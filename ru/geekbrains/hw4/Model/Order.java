package ru.geekbrains.hw4.Model;

import java.util.Random;
import java.util.TooManyListenersException;

public class Order {
    private Customer cust;
    private Product product;
    private int amount;

    private float total;
    private float totalWithDiscount;
    private int discount;

    enum Discount {
        ZERO(0), FIVE(5), TEN(10), FIFTEEN(15), TWENTY(20);

        private int discountSize;

        Discount(int discountSize) {
            this.discountSize = discountSize;
        }

        public int getDiscountSize() {
            return discountSize;
        }

        public static int discountSize(Product product) {
            Random random = new Random();
            Discount[] discount = Discount.values();
            int value = discount[random.nextInt(discount.length)].discountSize;

            if (product.getCategory().equals(Product.Category.PREMIUM)) {
                if (value > 15) {
                    value = 0;
                }
            }

            return value;
        }
    }

    public Order(Customer cust, Product product, int amount) {
        this.cust = cust;
        this.product = product;
        this.amount = amount;
        this.total = product.getPrice() * amount;
        this.discount = Discount.discountSize(product);
        this.totalWithDiscount = total - (total / 100 * discount);

    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return String.format("%-20s |     %-10s%-10s |     %-12d |     %-12.2f |     %-12d |     %.2f", cust.getPhone(),
                product.getTitle(), product.getCategory().name(), amount, total, discount, totalWithDiscount);
    }
}