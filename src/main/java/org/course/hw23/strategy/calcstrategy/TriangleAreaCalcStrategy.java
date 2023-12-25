package org.course.hw23.strategy.calcstrategy;

public class TriangleAreaCalcStrategy implements AreaCalcStrategy {
    @Override
    public double calculateArea(double... parameters) {
        if (parameters.length != 2) {
            throw new IllegalArgumentException("Для трикутника потрібно передати основу та висоту.");
        }
        double base = parameters[0];
        double height = parameters[1];
        return 0.5 * base * height;
    }
}
