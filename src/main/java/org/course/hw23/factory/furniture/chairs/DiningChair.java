package org.course.hw23.factory.furniture.chair;

public class DiningChair extends Chair {
    public DiningChair() {
        super("DefaultDinnerMaterial", "DefaultDinnerColor", 4);
    }

    public DiningChair(String material, String color, int legs) {
        super(material, color, legs);
    }

    @Override
    public void displayInfo() {
        System.out.println("=================");
        System.out.println("Information about dinner chair: ");
        System.out.println(this);
        System.out.println("=================");
    }

    @Override
    public String toString() {
        return "Dinner chair information: \n" + super.toString();
    }
}
