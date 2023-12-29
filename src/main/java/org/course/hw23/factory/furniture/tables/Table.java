package org.course.hw23.factory.furniture.table;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.course.hw23.factory.furniture.Furniture;


@Data
@AllArgsConstructor
public abstract class Table implements Furniture {
    protected String material;
    protected String color;
    protected String shape;
    @Override
    public void displayInfo() {
        System.out.println("=================");
        System.out.println("Information about table: ");
        System.out.println(this);
        System.out.println("=================");
    }

    @Override
    public String toString() {
        return "Material: " + material + '\n' +
                "Color: " + color + '\n' +
                "Shape: " + shape;
    }
}
