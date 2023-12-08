package org.course.hw17;

import org.course.hw17.exceptions.ProductNotFoundException;
import org.course.hw17.product.Product;
import org.course.hw17.product.ProductType;
import org.course.hw17.product.ProductUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            // Task 1
            List<Product> products1 = new ArrayList<>();

            products1.add(new Product(ProductType.BOOK, 100));
            products1.add(new Product(ProductType.BOOK, 260));
            products1.add(new Product(ProductType.BOOK, 300));
            products1.add(new Product(ProductType.FOOD, 60));
            products1.add(new Product(ProductType.ELECTRONICS, 700));


            System.out.println("Task 1");
            List<Product> booksWithCertainPrice = ProductUtils.getProductsWithCertainPrice(products1, ProductType.BOOK, 250);
            System.out.println(booksWithCertainPrice);


            // Task 2
            List<Product> products2 = new ArrayList<>();

            products2.add(new Product(ProductType.BOOK, 310, true));
            products2.add(new Product(ProductType.BOOK, 300, false));
            products2.add(new Product(ProductType.BOOK, 305, true));
            products2.add(new Product(ProductType.BOOK, 600, true));
            products2.add(new Product(ProductType.FOOD, 60, false));
            products2.add(new Product(ProductType.ELECTRONICS, 700, true));

            System.out.println("\nTask 2");
            List<Product> booksWithDiscount = ProductUtils.getProductsWithDiscount(products2, ProductType.BOOK);
            System.out.println(booksWithDiscount);


            // Task 3
            System.out.println("\nTask 3");
            Product cheapestBookWithoutDiscount = ProductUtils.getCheapestProduct(products2, ProductType.BOOK);
            System.out.println("The cheapest product without counting the discount: ");
            System.out.println(cheapestBookWithoutDiscount);

            System.out.println();
            Product cheapestBookWithDiscount = ProductUtils.getCheapestProductIncludingDiscount(products2, ProductType.BOOK);
            System.out.println("The cheapest product including counting discounts: ");
            System.out.println(cheapestBookWithDiscount);


            // Task 4
            List<Product> products4 = new ArrayList<>();

            products4.add(new Product(ProductType.BOOK, 310, true, LocalDate.of(2023, 12, 10)));
            products4.add(new Product(ProductType.BOOK, 300, false, LocalDate.of(2023, 11, 20)));
            products4.add(new Product(ProductType.BOOK, 305, true, LocalDate.of(2023, 10, 14)));
            products4.add(new Product(ProductType.BOOK, 600, true, LocalDate.of(2024, 1, 12)));
            products4.add(new Product(ProductType.FOOD, 60, false, LocalDate.of(2023, 9, 21)));
            products4.add(new Product(ProductType.ELECTRONICS, 700, true, LocalDate.of(2023, 6, 19)));

            System.out.println("\nTask 4");
            System.out.println("Three latest add products: ");
            List<Product> threeLatestAddProducts = ProductUtils.getSomeRecentProducts(products4,3);
            System.out.println(threeLatestAddProducts);


            // Task 5
            List<Product> products5 = new ArrayList<>();

            products5.add(new Product(ProductType.BOOK, 45, true, LocalDate.of(2023, 12, 10)));
            products5.add(new Product(ProductType.BOOK, 10, false, LocalDate.of(2023, 11, 20)));
            products5.add(new Product(ProductType.BOOK, 70, true, LocalDate.of(2023, 10, 14)));
            products5.add(new Product(ProductType.BOOK, 80, true, LocalDate.of(2023, 1, 12)));
            products5.add(new Product(ProductType.BOOK, 60, true, LocalDate.of(2022, 2, 13)));
            products5.add(new Product(ProductType.BOOK, 75, true, LocalDate.of(2023, 5, 18)));
            products5.add(new Product(ProductType.BOOK, 60, true, LocalDate.of(2022, 8, 21)));

            products5.add(new Product(ProductType.FOOD, 60, false, LocalDate.of(2023, 9, 21)));
            products5.add(new Product(ProductType.ELECTRONICS, 100, true, LocalDate.of(2023, 6, 19)));

            double totalPrice = ProductUtils.calcTotalPriceOfProducts(products5, ProductType.BOOK, 2023, 75.0);
            System.out.println("\nTask 5");
            System.out.println("Total Price: " + totalPrice);

            // Task 6
            List<Product> products6 = new ArrayList<>();

            products6.add(new Product(ProductType.BOOK, 65, true, LocalDate.of(2023, 12, 10)));
            products6.add(new Product(ProductType.BOOK, 100, false, LocalDate.of(2023, 11, 20)));
            products6.add(new Product(ProductType.BOOK, 120, true, LocalDate.of(2023, 10, 14)));
            products6.add(new Product(ProductType.FOOD, 20, true, LocalDate.of(2023, 1, 12)));
            products6.add(new Product(ProductType.ELECTRONICS, 600, true, LocalDate.of(2022, 2, 13)));
            products6.add(new Product(ProductType.FURNITURE, 470, true, LocalDate.of(2023, 5, 18)));
            products6.add(new Product(ProductType.BOOK, 60, true, LocalDate.of(2022, 8, 21)));
            products6.add(new Product(ProductType.FURNITURE, 670, true, LocalDate.of(2023, 8, 16)));
            products6.add(new Product(ProductType.CLOTHING, 270, true, LocalDate.of(2023, 9, 11)));
            products6.add(new Product(ProductType.FOOD, 70, true, LocalDate.of(2023, 12, 11)));

            Map<ProductType, List<Product>> groupedProducts = ProductUtils.groupProductsByType(products6);
            System.out.println("\nTask 6");
            groupedProducts.forEach((type, productList) -> {
                System.out.println("{");
                System.out.println("\t\"" + type + "\", ");
                System.out.println("\t[");
                productList.forEach(product -> {
                    System.out.println("\t\t{type: \"" + product.getType() +
                            "\", price: " + product.getPrice() +
                            ", discount: " + product.isDiscount() +
                            ", createDate: " + product.getCreateDate() +
                            ", product ID: " + product.getProductID() + "},");
                });
                System.out.println("\t]");
                System.out.println("},");
            });
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
