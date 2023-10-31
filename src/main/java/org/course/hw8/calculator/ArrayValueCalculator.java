package org.course.hw8.calculator;


import org.course.hw8.expetions.ArrayDataException;
import org.course.hw8.expetions.ArraySizeException;

import java.util.Arrays;

public class ArrayValueCalculator {
    //Version 2.0
    /**
     * Calculates the sum of integers in a 4x4 matrix and validates the input data.
     *
     * @param matrix A 2D array of strings representing a 4x4 matrix.
     * @return The sum of all the valid integer values in the matrix.
     * @throws ArraySizeException If the matrix does not have the correct size (4x4).
     * @throws ArrayDataException If any cell in the matrix contains non-integer data.
     */
    public static int doCalc(String[][] matrix) throws ArraySizeException {
        if (matrix.length != 4 || Arrays.stream(matrix).anyMatch(row -> row.length != 4)) {
            throw new ArraySizeException("Невірний розмір масиву.");
        }

        int[][] result = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    result[i][j] = Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Невірні дані в комірці [" + i + "][" + j + "].", e);
                }
            }
        }

        int totalSum = Arrays.stream(result)
                .mapToInt(row -> Arrays.stream(row).sum())
                .sum();

        return totalSum;
    }

//    Version 1.0
//    public static void doCalc(String[][] matrix) {
//        System.out.println(sumIntInString(matrix));
//        isArrSizeIncorrect(matrix);
//    }
//
//
//    public static void isArrSizeIncorrect(String[][] matrix) throws ArraySizeException {
//        final int CORRECT_SIZE = 4;
//
//        try {
//            if (matrix.length != CORRECT_SIZE) {
//                throw new ArrayDataException("Matrix is not 4x4");
//            }
//            for (int i = 0; i < CORRECT_SIZE; i++) {
//                if (matrix[i].length != CORRECT_SIZE) {
//                    throw new ArrayDataException("Matrix is not 4x4");
//                }
//            }
//        } catch (Exception e) {
//            throw new ArrayDataException("Matrix is not 4x4", e);
//        }
//
//    }
//
//    public static int sumIntInString(String[][] matrix) throws ArrayDataException {
//        int sum = 0;
//
//        for (int i = 0; i < matrix.length; i++){
//            for (int j = 0; j < matrix[0].length; j++) {
//                try {
//                    sum += Integer.parseInt(matrix[i][j]);
//                } catch (Exception e) {
//                    throw new ArrayDataException("An element of String matrix cannot be transform to int type, on position: [" + i + "][" + j + "]\"" + matrix[i][j] + "\"", e);
//                }
//            }
//        }
//
//        return sum;
//    }
}
