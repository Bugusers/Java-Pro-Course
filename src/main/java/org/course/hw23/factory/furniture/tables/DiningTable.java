package org.course.hw23.factory.furniture.tables;

public class DiningTable extends Table{
    public DiningTable() {
        super("Wood", "White", "Round");
    }
    @Override
    public void displayInfo() {
        System.out.println("=================");
        System.out.println("Information about dining table: ");
        System.out.println(this);
        System.out.println("=================");
    }
}
