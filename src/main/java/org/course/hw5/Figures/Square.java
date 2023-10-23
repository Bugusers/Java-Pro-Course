package org.course.hw5.Figures;

public class Square implements Figure{
    private double squareSide;

    public Square(double squareSide) {
        this.squareSide = squareSide;
    }

    @Override
    public double calculateAreaofFigure() {
        return Math.pow(squareSide, 2);
    }
}
