package org.course.hw23.builder.cars;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.course.hw23.builder.components.Engine;
import org.course.hw23.builder.components.GPSNavigator;
import org.course.hw23.builder.components.Transmission;


@AllArgsConstructor
@Getter
@ToString
public class Car {
    private CarType carType;
    private Engine engine;
    private Transmission transmission;
    private int seats;
    private boolean airConditioning;
    private GPSNavigator gpsNavigator;
}
