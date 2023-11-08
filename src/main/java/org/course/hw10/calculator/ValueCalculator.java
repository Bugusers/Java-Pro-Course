package org.course.hw10.calculator;

public class ValueCalculator {
    private double[] arr;
    private int arrSize;
    private int half;

    /**
     * Constructor for the ValueCalculator class.
     *
     * @param arraySize The size of the array, must be at least 1000000.
     */
    public ValueCalculator(int arraySize) {
        if (arraySize < 1000000) {
            System.out.println("Ввели меньше 1000000, тому довжена буду встановленна 1000000");
            arraySize = 1000000;
        }

        this.arrSize = arraySize;
        this.half = arrSize / 2;

        this.arr = new double[arrSize];
    }

    /**
     * Get the size of the array.
     *
     * @return The size of the array.
     */
    public int getArraySize() {
        return arrSize;
    }

    /**
     * Get half of the array size.
     *
     * @return Half of the array size.
     */
    public int getHalfArraySize() {
        return arr.length / 2;
    }

    /**
     * Performs calculations for the array using two threads.
     */
    public void calculate() {
        long start = System.currentTimeMillis();


        for (int i = 0; i < arrSize; i++) {
            arr[i] = 1.0;
        }

        double[] a1 = new double[half];
        double[] a2= new double[half];

        System.arraycopy(arr, 0 , a1, 0, half);
        System.arraycopy(arr, half, a2, 0, half);


        Thread thread1 = new Thread(() -> {
            calculateValue(a1, half);
        });

        Thread thread2= new Thread(() -> {
            calculateValue(a2, half);
        });

        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.arraycopy(a1, 0, arr, 0, half);
        System.arraycopy(a2, 0, arr, half, half);


        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("Час виконання: " + elapsedTime + " мілісекунд");
    }

    private void calculateValue(double[] arr, int arrSize) {
        for(int i = 0; i < arrSize; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
