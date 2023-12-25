package org.course.hw23.strategy.calcstrategy;

public class ShapeAreaCalculator {
    private AreaCalcStrategy calculationStrategy;

    public ShapeAreaCalculator(AreaCalcStrategy calculationStrategy) {
        this.calculationStrategy = calculationStrategy;
    }

    public void setCalculationStrategy(AreaCalcStrategy calculationStrategy) {
        this.calculationStrategy = calculationStrategy;
    }

    public double calculateArea(double... parameters) {
        return calculationStrategy.calculateArea(parameters);
    }
}