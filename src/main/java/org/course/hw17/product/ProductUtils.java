package org.course.hw17.product;


import org.course.hw17.exceptions.ProductNotFoundException;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Put the functions in this class for convenience.
public class ProductUtils {
    public static List<Product> getProductsWithCertainPrice(List<Product> products, ProductType type, int price) {
        return products.stream()
                .filter(product ->  product.getPrice() > price && product.getType() == type)
                .collect(Collectors.toList());
    }

    public static List<Product> getProductsWithDiscount(List<Product> products, ProductType type) {
        return products.stream()
                .filter(product -> product.getType() == type && product.isDiscount())
                .map(product -> {
                    double discountPrice = product.getPrice() - (product.getPrice() * 0.1);

                    return new Product(product.getType(), discountPrice, false, product.getCreateDate(), product.getProductID());
                })
                .collect(Collectors.toList());
    }

    public static Product getCheapestProductIncludingDiscount(List<Product> products, ProductType type) throws ProductNotFoundException {
        return products.stream()
                .filter(product -> product.getType() == type)
                .map(product -> {
                    if (product.isDiscount()) {
                        double discountPrice = product.getPrice() - (product.getPrice() * 0.1);

                        return new Product(product.getType(), discountPrice, true, product.getCreateDate(), product.getProductID());
                    }

                    return product;
                })
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new ProductNotFoundException(type.toString()));
    }

    public static Product getCheapestProduct(List<Product> products, ProductType type) throws ProductNotFoundException {
        return products.stream()
                .filter(product -> product.getType() == type)
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new ProductNotFoundException(type.toString()));
    }

    public static List<Product> getSomeRecentProducts(List<Product> products, int countOfProducts) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getCreateDate).reversed())
                .limit(countOfProducts)
                .collect(Collectors.toList());
    }

    public static double calcTotalPriceOfProducts(List<Product> products, ProductType type, int year ,double maxPrice) {
        LocalDate startDate = LocalDate.of(year, 1, 1);

        return products.stream()
                .filter(product -> product.getType() == type
                        && product.getCreateDate().isAfter(startDate)
                        && product.getPrice() <= maxPrice)
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public static Map<ProductType, List<Product>> groupProductsByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }
}
