package com.skypro.calculator.service;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorServiceImplTest {
    int a;
    int b;
    int c;
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @BeforeEach
    public void setUp() {
        a = 2;
        b = 2;
        c = 0;
    }


    @Test
    void greeting() {

        String expected = out.greeting();
        String actual = "Добро пожаловать в калькулятор";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shpuldShowPlusOperation() {
        String expected = out.showPlusOperation(a, b);
        String actual = a + " + " + b + " = " + (a + b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldShowMinusOperation() {
        String expected = out.showMinusOperation(a, b);
        String actual = a + " - " + b + " = " + (a - b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldShowMultiplyOperation() {
        String expected = out.showMultiplyOperation(a, b);

        String actual = a + " * " + b + " = " + (a * b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldShowDivideOperation() {
        String expected = out.showDivideOperation(a, b);

        String actual = a + " / " + b + " = " + (a / b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void showThrowIllegalArgumentExceptionDivideOperationWithMinusOpetator() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> out.showDivideOperation(a, c)
        );
    }
}