package org.course.hw23.factory.furniturefactory;

import org.course.hw23.factory.furniture.Furniture;
import org.course.hw23.factory.furniture.Table;

public class TableFactory implements FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Table("Glass", "Transparent", "Round");
    }
}

