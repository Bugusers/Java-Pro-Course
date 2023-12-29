package org.course.hw23.factory.furniture.chair;

public class OfficeChair extends Chair{
    public OfficeChair() {
        super("DefaultOfficeMaterial", "DefaultOfficeColor", 3);
    }

    public OfficeChair(String material, String color, int legs) {
        super(material, color, legs);
    }

    @Override
    public void displayInfo() {
        System.out.println("=================");
        System.out.println("Information about office chair: ");
        System.out.println(this);
        System.out.println("=================");
    }

    @Override
    public String toString() {
        return "Office chair information: \n" + super.toString();
    }
}
