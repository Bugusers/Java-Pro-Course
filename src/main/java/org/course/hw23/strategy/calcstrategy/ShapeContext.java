package org.course.hw23.strategy.calcstrategy;

public class ShapeContext {
    private ShapeStrategy strategy;

    public void setStrategy(ShapeStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateArea() {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set");
        }
        return strategy.calculateArea();
    }
}
