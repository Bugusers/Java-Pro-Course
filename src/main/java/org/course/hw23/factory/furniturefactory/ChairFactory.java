package org.course.hw23.factory.furniturefactory;

import org.course.hw23.factory.furniture.Chair;
import org.course.hw23.factory.furniture.Furniture;

public class ChairFactory implements FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Chair("Wood", "Brown", 4);
    }
}