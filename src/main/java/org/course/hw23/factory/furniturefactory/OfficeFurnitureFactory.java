package org.course.hw23.factory.furniturefactory;

import org.course.hw23.factory.furniture.chair.Chair;
import org.course.hw23.factory.furniture.chair.ChairType;
import org.course.hw23.factory.furniture.chair.DiningChair;
import org.course.hw23.factory.furniture.chair.OfficeChair;

public class IkeaFactory implements FurnitureFactory {
    @Override
    public Chair createChair(ChairType type) {
        switch (type){
            case OFFICE_CHAIR -> {
                return new OfficeChair();
            }
            case DINING_CHAIR -> {
                return new DiningChair();
            }
            default -> throw new IllegalArgumentException("Unsupported chair type");
        }
    }


}
