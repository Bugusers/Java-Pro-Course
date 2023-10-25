package org.course.hw5.Figures;

public class Triangle implements Figure {
    private double a;
    private double b;
    private double c;
    private String type;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        defineTypeTriangle();
    }

    private void defineTypeTriangle() {
        if (a == b && b == c) {
            type = "Equilateral";
        } else if (a == b || a == c || b == c) {
            type = "Isosceles";
        } else {
            type = "Versatile";
        }
    }
    @Override
    public double calculateAreaofFigure() {
        if (type != null) {
            if (type.equals("Equilateral")) {
                return calculateAreaEquilateral();
            }
            if (type.equals("Isosceles")) {
              return calculateAreaIsosceles();
            }
            if (type.equals("Versatile")) {
                return calculateAreaVersatile();
            }
        }
        return 0;
    }

    private double calculateAreaIsosceles() {
        double base, height;

        if (a == b) {
            base = c;
            height = Math.sqrt(Math.pow(a, 2) - Math.pow((base / 2), 2));

            return 0.5 * base * height;
        }

        if (a == c) {
            base = b;
            height = Math.sqrt(Math.pow(a, 2) - Math.pow((base / 2), 2));
            return 0.5 * base * height;
        }
        if (b == c){
            base = a;

            height = Math.sqrt(Math.pow(b, 2) - Math.pow((base / 2), 2));
            return 0.5 * base * height;
        }



        return 0.0;
    }

    private double calculateAreaVersatile() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    private double calculateAreaEquilateral() {
        return Math.pow(a, 2) * Math.sqrt(3) / 4;
    }
}
