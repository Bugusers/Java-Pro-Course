package org.course.hw23.factory.furniture.chairs;

public class DiningChair extends Chair {
    public DiningChair() {
        super("DefaultDinnerMaterial", "DefaultDinnerColor", 4);
    }

    @Override
    public void displayInfo() {
        System.out.println("=================");
        System.out.println("Information about dinner chair: ");
        System.out.println(this);
        System.out.println("=================");
    }
}
