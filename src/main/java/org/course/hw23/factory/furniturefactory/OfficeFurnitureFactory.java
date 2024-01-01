package org.course.hw23.factory.furniturefactory;

import org.course.hw23.factory.furniture.chairs.Chair;
import org.course.hw23.factory.furniture.chairs.ChairType;
import org.course.hw23.factory.furniture.chairs.ModernOfficeChair;
import org.course.hw23.factory.furniture.chairs.OfficeChair;
import org.course.hw23.factory.furniture.tables.ConferenceTable;
import org.course.hw23.factory.furniture.tables.OfficeTable;
import org.course.hw23.factory.furniture.tables.Table;
import org.course.hw23.factory.furniture.tables.TableType;

public class OfficeFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair(ChairType type) {
        switch (type){
            case OFFICE_CHAIR -> {
                return new OfficeChair();
            }
            case MODERN_OFFICE_CHAIR -> {
                return new ModernOfficeChair();
            }
            default -> throw new IllegalArgumentException("Unsupported chair type");
        }
    }

    @Override
    public Table createTable(TableType type) {
        switch (type){
            case OFFICE_TABLE -> {
                return new OfficeTable();
            }
            case CONFERENCE_TABLE -> {
                return new ConferenceTable();
            }
            default -> throw new IllegalArgumentException("Unsupported chair type");
        }
    }


}
