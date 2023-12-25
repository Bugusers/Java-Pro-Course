package org.course.hw23.builder;

import org.course.hw23.builder.builders.CarBuilder;
import org.course.hw23.builder.cars.Car;
import org.course.hw23.builder.director.Director;

public class BuilderCarApp {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();

        director.constructCityCar(builder);
        Car cityCar = builder.getResult();
        System.out.println(cityCar);

        director.constructSportsCar(builder);
        Car sportCar = builder.getResult();
        System.out.println(sportCar);

        director.constructSUV(builder);
        Car suvCar = builder.getResult();
        System.out.println(suvCar);
    }
}
