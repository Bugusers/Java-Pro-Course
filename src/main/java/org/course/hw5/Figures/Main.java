package org.course.hw5.Figures;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Circle(5);
        figures[1] = new Square(4);
        figures[2] = new Triangle(3, 4, 5);
        figures[3] = new Triangle(5, 5, 5);
        figures[4] = new Triangle(5, 5, 6);

        double totalArea = calculateTotalArea(figures);

        System.out.printf("Суммарная площадь всех фигур: %.2f", totalArea);
    }

    public static double calculateTotalArea(Figure[] figures) {
        double totalArea = 0;

        for (Figure figure : figures) {
            totalArea += figure.calculateAreaofFigure();
        }

        return totalArea;
    }
}