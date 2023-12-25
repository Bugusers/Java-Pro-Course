package org.course.hw23.strategy;

import org.course.hw23.strategy.calcstrategy.AreaCalcStrategy;
import org.course.hw23.strategy.calcstrategy.ShapeAreaCalculator;
import org.course.hw23.strategy.calcstrategy.TriangleAreaCalcStrategy;
import org.course.hw23.strategy.calcstrategy.RectangleAreaCalсStrategy;
import org.course.hw23.strategy.calcstrategy.SquareAreaCalcStrategy;
import org.course.hw23.strategy.figures.Rectangle;
import org.course.hw23.strategy.figures.Square;
import org.course.hw23.strategy.figures.Triangle;

public class App {
    public static void main(String[] args) {
        AreaCalcStrategy rectangleStrategy = new RectangleAreaCalсStrategy();
        AreaCalcStrategy triangleStrategy = new TriangleAreaCalcStrategy();
        AreaCalcStrategy squareStrategy = new SquareAreaCalcStrategy();

        ShapeAreaCalculator calculator = new ShapeAreaCalculator(triangleStrategy);


        Triangle triangle = new Triangle(3, 6);
        double areaOfTriangle = calculator.calculateArea(triangle.getBase(), triangle.getHeight());
        System.out.println("Площа трикутника: " + areaOfTriangle);


        calculator.setCalculationStrategy(squareStrategy);
        Square square = new Square(4);
        double areaOfSquare = calculator.calculateArea(square.getSide());
        System.out.println("Площа квадрата: " + areaOfSquare);


        calculator.setCalculationStrategy(rectangleStrategy);
        Rectangle rectangle = new Rectangle(4, 10);
        double areaOfRectangle = calculator.calculateArea(rectangle.getWidth(), rectangle.getHeight());
        System.out.println("Площа прямокутника: " + areaOfRectangle);
    }
}
