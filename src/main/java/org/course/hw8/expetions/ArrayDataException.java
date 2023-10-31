package org.course.hw8.expetions;

public class ArrayDataException extends NumberFormatException{
    public ArrayDataException(String message, Throwable cause) {super(message);}

    public ArrayDataException(String message) {
        super(message);
    }
}
