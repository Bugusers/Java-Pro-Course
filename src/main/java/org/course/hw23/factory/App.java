package org.course.hw23.factory;

import org.course.hw23.factory.furniture.Furniture;
import org.course.hw23.factory.furniturefactory.ChairFactory;
import org.course.hw23.factory.furniturefactory.FurnitureFactory;
import org.course.hw23.factory.furniturefactory.SofaFactory;
import org.course.hw23.factory.furniturefactory.TableFactory;

public class App {
    public static void main(String[] args) {
        FurnitureFactory chairFactory = new ChairFactory();
        FurnitureFactory sofaFactory = new SofaFactory();
        FurnitureFactory tableFactory = new TableFactory();

        Furniture chair = chairFactory.createFurniture();
        Furniture sofa = sofaFactory.createFurniture();
        Furniture table = tableFactory.createFurniture();

        chair.displayInfo();
        sofa.displayInfo();
        table.displayInfo();
    }
}
