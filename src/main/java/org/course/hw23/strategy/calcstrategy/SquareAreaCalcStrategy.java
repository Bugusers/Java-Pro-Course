package org.course.hw23.strategy.calcstrategy;

public class SquareAreaCalcStrategy implements AreaCalcStrategy {
    @Override
    public double calculateArea(double... parameters) {
        if (parameters.length != 1) {
            throw new IllegalArgumentException("Для прямокутника потрібно передати ширину та висоту.");
        }

        double side = parameters[0];

        return side * side;
    }
}

