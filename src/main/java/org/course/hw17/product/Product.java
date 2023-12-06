package org.course.hw17.product;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Random;


@Getter
@ToString
public class Product {
    private final ProductType type;
    private final double price;
    private final boolean isDiscount;
    private final LocalDate createDate;
    private final int productID;

    public Product(ProductType type, double price, boolean isDiscount, LocalDate createDate, int productID) {
        this.type = type;
        this.price = price;
        this.isDiscount = isDiscount;
        this.createDate = createDate;
        this.productID = productID;
    }

    public Product(ProductType type, double price, boolean isDiscount, LocalDate createDate) {
        this(type, price, isDiscount, createDate, new Random().nextInt(201));
    }
    public Product(ProductType type, double price, boolean isDiscount) {
        this(type, price, isDiscount, LocalDate.now(), new Random().nextInt(201));
    }

    public Product(ProductType type, double price) {
        this(type, price, false);
    }
}
