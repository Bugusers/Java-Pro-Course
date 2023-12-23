package org.course.hw23.builder.director;

import org.course.hw23.builder.builders.Builder;
import org.course.hw23.builder.cars.CarType;
import org.course.hw23.builder.components.Engine;
import org.course.hw23.builder.components.GPSNavigator;
import org.course.hw23.builder.components.Transmission;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setCarType(CarType.SPORT_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setAirConditioning(true);
        builder.setGPS(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.reset();
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setGPS(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.reset();
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPS(new GPSNavigator());
    }
}
