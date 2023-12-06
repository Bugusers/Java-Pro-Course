package org.course.hw17.product1;

import java.time.LocalDate;

public class Product {
    private String type;
    private double price;
    private boolean isDiscount;
    private LocalDate date;
    private int productID;

    public Product(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public Product(String type, double price, boolean isDiscount) {
        this.type = type;
        this.price = price;
        this.isDiscount = isDiscount;
    }

    public Product(String type, double price, boolean isDiscount, LocalDate date) {
        this.type = type;
        this.price = price;
        this.isDiscount = isDiscount;
        this.date = date;
    }



    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getProductID() {
        return productID;
    }
}
