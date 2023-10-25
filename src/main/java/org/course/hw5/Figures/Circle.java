package org.course.hw5.Figures;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateAreaofFigure() {
        return Math.PI * Math.pow(radius, 2);
    }
}
