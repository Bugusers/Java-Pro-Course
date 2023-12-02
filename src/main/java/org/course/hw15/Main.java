package org.course.hw15;

import org.course.hw15.utils.SortedUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {-5, -2, 9, 1, 5, 6, -12, -32, -3, 0, 100};

        System.out.println("Sort by quickSort");
        System.out.println("Original array: " + Arrays.toString(array));

        SortedUtils.quickSort(array, 0, array.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(array));


        int[] array1 = {-5, -2, 9, 1, 5, 6, -12, -32, -3, 0, 100};
        System.out.println("Sort by shaker sort");
        System.out.println("Original array: " + Arrays.toString(array1));

        SortedUtils.shakerSort(array1);

        System.out.println("Sorted array: " + Arrays.toString(array1));
    }
}
