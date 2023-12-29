package org.course.hw23.factory.furniturefactory;

import org.course.hw23.factory.furniture.chairs.Chair;
import org.course.hw23.factory.furniture.chairs.ChairType;
import org.course.hw23.factory.furniture.tables.Table;
import org.course.hw23.factory.furniture.tables.TableType;

public interface FurnitureFactory {
    Chair createChair(ChairType type);
    Table createTable(TableType type);
}
