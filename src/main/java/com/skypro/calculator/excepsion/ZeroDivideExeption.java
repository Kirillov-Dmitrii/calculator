package com.skypro.calculator.excepsion;

public class ZeroDivideExeption extends IllegalArgumentException {
    public ZeroDivideExeption() {
    }

    public ZeroDivideExeption(String s) {
        super(s);
    }

    public ZeroDivideExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public ZeroDivideExeption(Throwable cause) {
        super(cause);
    }
}
