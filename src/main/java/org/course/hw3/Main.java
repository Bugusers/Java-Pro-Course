package org.course.hw3;

import org.course.hw3.Car.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, "Silver");

        Employee employee = new Employee("John", "Doe", "johndoe@gmail.com", "+3809845578", "Manager", 24, car);

        employee.getEmploeesCar().start();
        System.out.println("--------------------");
        employee.getEmploeesCar().displayCarInfo();
        System.out.println("--------------------");
        employee.getEmploeesCar().stop();
        System.out.println("--------------------");
        employee.getEmploeesCar().displayCarInfo();

    }
}