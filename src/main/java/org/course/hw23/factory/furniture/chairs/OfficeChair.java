package org.course.hw23.factory.furniture.chairs;

public class OfficeChair extends Chair{
    public OfficeChair() {
        super("DefaultOfficeMaterial", "DefaultOfficeColor", 3);
    }
    @Override
    public void displayInfo() {
        System.out.println("=================");
        System.out.println("Information about office chair: ");
        System.out.println(this);
        System.out.println("=================");
    }
}
