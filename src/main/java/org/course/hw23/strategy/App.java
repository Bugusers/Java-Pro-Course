package org.course.hw23.strategy;


import org.course.hw23.strategy.calcstrategy.RectangleStrategy;
import org.course.hw23.strategy.calcstrategy.ShapeContext;
import org.course.hw23.strategy.calcstrategy.TriangleStrategy;

public class App {
    public static void main(String[] args) {
        ShapeContext context = new ShapeContext();

        context.setStrategy(new RectangleStrategy(5, 10));
        System.out.println("Rectangle Area: " + context.calculateArea());

        context.setStrategy(new TriangleStrategy(4, 6));
        System.out.println("Triangle Area: " + context.calculateArea());
    }
}
