package org.course.hw23.factory.furniturefactory;

import org.course.hw23.factory.furniture.chair.*;

public class OttoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair(ChairType type) {
        switch (type){
            case RECLINER_CHAIR -> {
                return new ReclinerChair();
            }
            case ROCKING_CHAIR -> {
                return new RockingChair();
            }
            default -> throw new IllegalArgumentException("Unsupported chair type");
        }
    }

}
