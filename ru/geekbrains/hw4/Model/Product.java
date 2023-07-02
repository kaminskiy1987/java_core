package ru.geekbrains.hw4.Model;

import java.util.Random;

public class Product {
    private String title;
    private float price;
    private Category category;

    enum Category {
        PREMIUM, STANDARD;
    }

    public static Category productCategory() {
        Random random = new Random();
        Product.Category[] category = Product.Category.values();
        Category value = category[random.nextInt(category.length)];
        return value;
    }

    public Product(String title, float price) {
        this.title = title;
        this.price = price;
        this.category = productCategory();
    }

    public Category getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}