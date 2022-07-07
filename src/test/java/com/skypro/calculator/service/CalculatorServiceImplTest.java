package com.skypro.calculator.service;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.skypro.calculator.excepsion.ZeroDivideExeption;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorServiceImplTest {
    final int ZERO = 0;
    final int ONE = 1;
    final int TWO = 2;
    final int TREE = 3;
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();



    @Test
    void greeting() {

        String expected = out.greeting();
        String actual = "Добро пожаловать в калькулятор";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldShowPlusOperation() {
        String expected = out.showPlusOperation(ONE, TWO);
        String actual = ONE + " + " + TWO + " = " + (ONE + TWO);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldShowMinusOperation() {
        String expected = out.showPlusOperation(ONE, TWO);
        String actual = ONE + " - " + TWO + " = " + (ONE - TWO);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldShowMultiplyOperation() {
        String expected = out.showPlusOperation(ONE, TWO);
        String actual = ONE + " * " + TWO + " = " + (ONE * TWO);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldShowDivideOperation() {
        String expected = out.showPlusOperation(ONE, TWO);
        String actual = ONE + " / " + TWO + " = " + (ONE / TWO);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void showThrowIllegalArgumentExceptionDivideOperationWithMinusOperator() {
        Assertions.assertThrows(ZeroDivideExeption.class,
                () -> out.showDivideOperation(ONE, ZERO)
        );
    }
}