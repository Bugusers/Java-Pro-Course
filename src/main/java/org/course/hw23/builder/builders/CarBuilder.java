package org.course.hw23.builder.builders;

import org.course.hw23.builder.cars.Car;
import org.course.hw23.builder.cars.CarType;
import org.course.hw23.builder.components.Engine;
import org.course.hw23.builder.components.GPSNavigator;
import org.course.hw23.builder.components.Transmission;

public class CarBuilder implements Builder {
    private CarType carType;
    private Engine engine;
    private Transmission transmission;
    private int seats;
    private boolean airConditioning;
    private GPSNavigator gpsNavigator;
    private Car car;

    @Override
    public void setCarType(CarType type) {
        this.carType = type;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setAirConditioning(boolean hasAirConditioning) {
        this.airConditioning = hasAirConditioning;
    }

    @Override
    public void setGPS(GPSNavigator gps) {
        this.gpsNavigator = gps;
    }

    @Override
    public void reset() {
        this.carType = null;
        this.engine = null;
        this.transmission = null;
        this.seats = 0;
        this.airConditioning = false;
        this.gpsNavigator = null;
    }

    public Car getResult() {
        return new Car(carType, engine, transmission, seats, airConditioning, gpsNavigator);
    }
}
