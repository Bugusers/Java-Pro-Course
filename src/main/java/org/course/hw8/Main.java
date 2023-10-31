package org.course.hw8;

import org.course.hw8.calculator.ArrayValueCalculator;

public class Main {
    public static void main(String[] args) {
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();

        String[][] arr1 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"5", "6", "7", "8"}, {"5", "6", "7", "8"}}; // 4x4 correct
        String[][] arr2 = {{"1", "2q", "3", "4"}, {"5", "6", "7", "8"}, {"5", "6", "7", "8"}, {"5", "6", "7", "8"}}; // have not int
        String[][] arr3 = {{"1", "2", "3", "4", "9"}, {"5", "6", "7", "8", "10", "11"}}; // 2D array with different row lengths

        try {
            System.out.println(arrayValueCalculator.doCalc(arr1));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println(arrayValueCalculator.doCalc(arr2));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println(arrayValueCalculator.doCalc(arr3));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}