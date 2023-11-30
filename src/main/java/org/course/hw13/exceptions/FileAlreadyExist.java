package org.course.hw13.exceptions;

public class FileAlreadyExist extends Exception{
    public FileAlreadyExist(String message) {
        super(message);
    }
    public FileAlreadyExist(String message, Throwable cause) {
        super(message, cause);
    }
}