package org.course.hw23.builder.builders;

import org.course.hw23.builder.cars.CarType;
import org.course.hw23.builder.components.Engine;
import org.course.hw23.builder.components.GPSNavigator;
import org.course.hw23.builder.components.Transmission;

public interface Builder {
    void setCarType(CarType type);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setSeats(int seats);
    void setAirConditioning(boolean hasAirConditioning);
    void setGPS(GPSNavigator gps);
    void reset();
}
