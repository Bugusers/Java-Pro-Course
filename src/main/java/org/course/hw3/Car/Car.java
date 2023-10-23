package org.course.hw3.Car;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private boolean isRunning;

    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;

        this.isRunning = false;
    }

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();

        isRunning = true;
    }

    public void stop() {
        isRunning = false;
        System.out.println("The car has stopped.");
    }


    private void startCommand() {
        System.out.println("Sending start command to the engine");
    }

    private void startElectricity() {
        System.out.println("Starting the car's electrical system");
    }

    private void startFuelSystem() {
        System.out.println("Starting the car's fuel system");
    }



    public void displayCarInfo() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Car Info: \n" +
                "brand = " + brand + '\n' +
                "model = " + model + '\n' +
                "year = " + year + '\n' +
                "color = " + color + '\n' +
                "isRunning = " + isRunning;
    }
}
