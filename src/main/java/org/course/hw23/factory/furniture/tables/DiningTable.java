package org.course.hw23.factory.furniture.table;

public class DiningTable extends Table{
    public DiningTable() {
        super("Wood", "White", "Round");
    }

    public DiningTable(String material, String color, String shape) {
        super(material, color, shape);
    }

    @Override
    public void displayInfo() {
        System.out.println("=================");
        System.out.println("Information about dining table: ");
        System.out.println(this);
        System.out.println("=================");
    }

    @Override
    public String toString() {
        return "Dining table information \n" + super.toString();
    }
}
