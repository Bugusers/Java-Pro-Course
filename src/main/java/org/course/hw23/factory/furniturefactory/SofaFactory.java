package org.course.hw23.factory.furniturefactory;

import org.course.hw23.factory.furniture.Furniture;
import org.course.hw23.factory.furniture.Sofa;

public class SofaFactory implements FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Sofa("Leather", "Black", 3);
    }
}