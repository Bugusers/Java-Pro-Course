package org.course.hw8.hw6;


public class Main {
    public static void main(String[] args) {
        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();

        int a = 5;
        int b = 15;
        System.out.println(isSumInRange(a, b));

        checkNumber(a);
        checkNumber(a - 20);

        System.out.println(isNegativeNum(b));

        printStringMultipleTimes("Hello world", 5);
        printStringMultipleTimes("Hello world", 0);


        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2004));
        System.out.println(isLeapYear(2005));
        System.out.println(isLeapYear(2008));
    }

    // Task 1
    /**
     * Prints three words on the console: "Orange", "Banana", and "Apple"
     */
    public static void printThreeWords() {
        System.out.println("Orange\n" +
                "\n" +
                "Banana\n" +
                "\n" +
                "Apple");
    }

    // Task 2
    /**
     * Checks the sign of the sum of two numbers and prints an appropriate message
     */
    public static void checkSumSign() {
        int a = 100;
        int b = -99;

        if (a + b > 0) {
            System.out.println("Сума позитивна");
            return;
        } else {
            System.out.println("Сума негативна");
        }
    }

    // Task 3
    /**
     * Prints a color status based on the "value" parameter
     */
    public static void printColor() {
        int value = 90;

        if (value <= 0) {
            System.out.println("Червоний");
        }

        if (value > 0 && value <= 100) {
            System.out.println("Жовтий");
        }

        if (value > 100) {
            System.out.println("Зелений");
        }
    }

    // Task 4
    /**
     * Compares two numbers and prints the comparison result.
     */
    public static void compareNumbers() {
        int a = 100;
        int b = -99;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // Task 5
    /**
     * Checks if the sum of two numbers is in the range from 10 to 20 (inclusive).
     *
     * @param num1 The first number for addition.
     * @param num2 The second number for addition.
     * @return `true` if the sum is in the range, `false` otherwise.
     */
    public static boolean isSumInRange(int num1, int num2) {
        return (num1 + num2) > 10 && (num1 + num2) <= 20;
    }

    // Task 6
    /**
     * Checks if a number is positive or negative and prints the appropriate message.
     *
     * @param num The number to check.
     */
    public static void checkNumber(int num) {
        if (num >= 0) {
            System.out.println("Ви передали додатне число");
            return;
        }

        System.out.println("Ви передали від'ємне число");
    }

    // Task 7
    /**
     * Checks if a number is negative.
     *
     * @param num The number to check.
     * @return `true` if the number is negative, `false` otherwise.
     */
    public static boolean isNegativeNum(int num) {
        if (num < 0) {
            return true;
        }

        return false;
    }

    // Task 7
    /**
     * Prints a given string a specified number of times.
     *
     * @param text  The string to print.
     * @param count The number of times to print the string.
     */
    public static void printStringMultipleTimes(String text, int count) {
        if (count <= 0) {
            System.out.println("\nНе можу надрукувати меньше, а ніж один раэ");
            System.out.println(text);
        }
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    // Task 8
    /**
     * Checks if a year is a leap year based on the specified conditions.
     *
     * @param year The year to check for leap year status.
     * @return `true` if the year is a leap year, `false` otherwise.
     */
    public static boolean isLeapYear(int year) {
        if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0)  {
            return true;
        }
        return false;
    }
}