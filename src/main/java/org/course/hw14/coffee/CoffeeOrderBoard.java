package org.course.hw14.coffee;

import org.course.hw14.coffee.order.Order;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class CoffeeOrderBoard {
    private Queue<Order> orderQueue;

    public CoffeeOrderBoard() {
        this.orderQueue = new LinkedList<>();
    }

    public void add(Order order) {
        int currentOrderNum = orderQueue.size() + 1;

        order.setOrderNumber(currentOrderNum);

        orderQueue.add(order);
    }

    public Order deliver() throws NoSuchElementException  {
        if (orderQueue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty. Cannot deliver an order.");
        }

        return orderQueue.poll();
    }

    public Order deliver(int orderNum) throws NoSuchElementException {
        if (orderQueue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty. Cannot deliver an order.");
        }


        Order foundOrder = orderQueue.stream()
                .filter(order -> order.getOrderNumber() == orderNum)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Order with number " + orderNum + " not found."));

        orderQueue.remove(foundOrder);

        return foundOrder;
    }

    public void draw() {
        if (orderQueue.isEmpty()) {
            System.out.println("Queue is empty!!!");
            return;
        }

        System.out.println("\n-------------------------------------------");
        for (Order order : orderQueue) {
            System.out.println(order.getOrderNumber() + " | " + order.getClientName());
        }
        System.out.println("-------------------------------------------\n");
    }
}
