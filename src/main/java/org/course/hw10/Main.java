package org.course.hw10;


import org.course.hw10.calculator.ValueCalculator;

public class Main {
    public static void main(String[] args) {
        ValueCalculator valueCalculator = new ValueCalculator(2000000);
        valueCalculator.calculate();
    }
}