package org.course.hw23.factory.furniture.tables;

public class ConferenceTable extends Table {
    public ConferenceTable() {
        super("Wood", "Brown", "Rectangular");
    }
    @Override
    public void displayInfo() {
        System.out.println("=================");
        System.out.println("Information about conference table: ");
        System.out.println(this);
        System.out.println("=================");
    }
}
