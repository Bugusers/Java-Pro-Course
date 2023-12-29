package org.course.hw23.factory.furniture.tables;

public class OfficeTable extends Table{
    public OfficeTable() {
        super("Metal", "Gray", "Rectangular");
    }
    @Override
    public void displayInfo() {
        System.out.println("=================");
        System.out.println("Information about office table: ");
        System.out.println(this);
        System.out.println("=================");
    }
}
