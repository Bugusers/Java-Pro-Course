package org.course.hw23.factory.furniture.chairs;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.course.hw23.factory.furniture.Furniture;


@Data
@AllArgsConstructor
public abstract class Chair implements Furniture {
    protected String material;
    protected String color;
    protected int legs;

    @Override
    public void displayInfo() {
        System.out.println("=================");
        System.out.println("Information about chair: ");
        System.out.println(this);
        System.out.println("=================");
    }

    @Override
    public String toString() {
        return "Material: " + material + '\n' +
                "Color: " + color + '\n' +
                "Legs: " + legs;
    }
}
