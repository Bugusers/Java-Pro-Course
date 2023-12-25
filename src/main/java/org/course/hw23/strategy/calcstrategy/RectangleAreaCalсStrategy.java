package org.course.hw23.strategy.calcstrategy;

public class RectangleAreaCalсStrategy implements AreaCalcStrategy {
    @Override
    public double calculateArea(double... parameters) {
        if (parameters.length != 2) {
            throw new IllegalArgumentException("Для прямокутника потрібно передати ширину та висоту.");
        }

        double width = parameters[0];
        double height = parameters[1];

        return width * height;
    }
}
