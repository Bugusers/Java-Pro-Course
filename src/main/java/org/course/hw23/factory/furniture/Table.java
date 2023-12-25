package org.course.hw23.factory.furniture;


import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
public class Table implements Furniture {
    private String material;
    private String color;
    private String shape;
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
