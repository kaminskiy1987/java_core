package ru.geekbrains.hw4.Exceptions;

public class TooMuchSaleException extends RuntimeException {
    public TooMuchSaleException(String message) {
        super(message);
    }
}