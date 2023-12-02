package org.course.hw14.coffee;

import org.course.hw14.coffee.order.Order;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        try {
            CoffeeOrderBoard board = new CoffeeOrderBoard();

            board.add(new Order("Alen"));
            board.add(new Order("Yoda"));
            board.add(new Order("Obi-van"));
            board.add(new Order("John Snow"));
            board.add(new Order("Andrew"));
            board.add(new Order("Anni"));


            board.draw();

            Order diliverFirstOrder = board.deliver();
            System.out.println("Delivering order " + diliverFirstOrder.getOrderNumber() + " for " + diliverFirstOrder.getClientName());

            board.draw();


            Order diliverThirdOrder = board.deliver(3);
            System.out.println("Delivering order " + diliverThirdOrder.getOrderNumber() + " for " + diliverThirdOrder.getClientName());

            board.draw();
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}