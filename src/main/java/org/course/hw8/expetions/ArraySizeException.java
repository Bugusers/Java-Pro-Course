package org.course.hw8.expetions;

public class ArraySizeException extends ArithmeticException{
    public ArraySizeException(String message, Throwable cause) {}

    public ArraySizeException(String message) {
        super(message);
    }
}
