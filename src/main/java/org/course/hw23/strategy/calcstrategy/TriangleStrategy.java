package org.course.hw23.strategy.calcstrategy;

public class TriangleStrategy implements ShapeStrategy {
    private double base;
    private double height;

    public TriangleStrategy(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}