package org.course.hw23.factory.furniturefactory;

import org.course.hw23.factory.furniture.chairs.BarChair;
import org.course.hw23.factory.furniture.chairs.Chair;
import org.course.hw23.factory.furniture.chairs.ChairType;
import org.course.hw23.factory.furniture.chairs.DiningChair;
import org.course.hw23.factory.furniture.tables.CoffeeTable;
import org.course.hw23.factory.furniture.tables.DiningTable;
import org.course.hw23.factory.furniture.tables.Table;
import org.course.hw23.factory.furniture.tables.TableType;

public class DiningFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair(ChairType type) {
        switch (type){
            case DINING_CHAIR -> {
                return new DiningChair();
            }
            case BAR_CHAIR -> {
                return new BarChair();
            }
            default -> throw new IllegalArgumentException("Unsupported chair type");
        }
    }

    @Override
    public Table createTable(TableType type) {
        switch (type){
            case DINING_TABLE -> {
                return new DiningTable();
            }
            case COFFEE_TABLE -> {
                return new CoffeeTable();
            }

            default -> throw new IllegalArgumentException("Unsupported chair type");
        }
    }

}
