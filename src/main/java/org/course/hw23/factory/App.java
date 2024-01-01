package org.course.hw23.factory;


import org.course.hw23.factory.furniture.chairs.Chair;
import org.course.hw23.factory.furniture.chairs.ChairType;
import org.course.hw23.factory.furniture.tables.Table;
import org.course.hw23.factory.furniture.tables.TableType;
import org.course.hw23.factory.furniturefactory.DiningFurnitureFactory;
import org.course.hw23.factory.furniturefactory.FurnitureFactory;
import org.course.hw23.factory.furniturefactory.OfficeFurnitureFactory;

public class App {
    public static void main(String[] args) {
        FurnitureFactory factory1 = new OfficeFurnitureFactory();
        Table conferenceTable = factory1.createTable(TableType.CONFERENCE_TABLE);
        conferenceTable.displayInfo();

        Table officeTable = factory1.createTable(TableType.OFFICE_TABLE);
        officeTable.displayInfo();

        Chair modernChair = factory1.createChair(ChairType.MODERN_OFFICE_CHAIR);
        modernChair.displayInfo();


        Chair officeChair = factory1.createChair(ChairType.OFFICE_CHAIR);
        officeChair.displayInfo();


        FurnitureFactory factory2 = new DiningFurnitureFactory();
        Chair diningChair = factory2.createChair(ChairType.DINING_CHAIR);
        diningChair.displayInfo();

        Chair barChair = factory2.createChair(ChairType.BAR_CHAIR);
        barChair.displayInfo();

        Table coffeeTable = factory2.createTable(TableType.COFFEE_TABLE);
        coffeeTable.displayInfo();

        Table diningTable = factory2.createTable(TableType.DINING_TABLE);
        diningTable.displayInfo();

    }
}
