package org.course.hw23.factory.furniture.chairs;

public class BarChair extends Chair {
    public BarChair() {
        super("Metal", "Black", 5);
    }

    @Override
    public void displayInfo() {
        System.out.println("=================");
        System.out.println("Information about bar chair: ");
        System.out.println(this);
        System.out.println("=================");
    }
}