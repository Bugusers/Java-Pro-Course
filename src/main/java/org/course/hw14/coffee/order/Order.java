package org.course.hw14.coffee.order;

public class Order {
    private int orderNumber;
    private final String clientName;

    public Order(String clientName) {
        this.clientName = clientName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

}
