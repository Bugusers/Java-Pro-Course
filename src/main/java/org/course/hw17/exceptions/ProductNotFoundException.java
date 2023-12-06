package org.course.hw17.exceptions;

public class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String category) {
        super("Product [category: " + category + "] not found");
    }
}
