package org.course.hw23.factory.furniture.tables;

public class CoffeeTable extends Table{
    public CoffeeTable() {
        super("Wood", "Coffee", "Round");
    }
    @Override
    public void displayInfo() {
        System.out.println("=================");
        System.out.println("Information about coffee table: ");
        System.out.println(this);
        System.out.println("=================");
    }
}
