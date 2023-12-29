package org.course.hw23.factory.furniture.chairs;

public class ModernOfficeChair extends Chair {
    public ModernOfficeChair() {
        super("Plastic", "White", 5);
    }
    @Override
    public void displayInfo() {
        System.out.println("=================");
        System.out.println("Information about modern office chair: ");
        System.out.println(this);
        System.out.println("=================");
    }
}