package com.skypro.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {


    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    public String showPlusOperation(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String showMinusOperation(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }


    public String showMultiplyOperation(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String showDivideOperation(int num1, int num2) {
        if (num2 == 0) {
            return "Бесконечность не предел, но давай что-то побольше";
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
