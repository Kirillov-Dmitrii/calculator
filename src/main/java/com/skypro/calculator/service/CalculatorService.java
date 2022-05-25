package com.skypro.calculator.service;

public interface CalculatorService {
    String greeting();
    String showPlusOperation(int num1, int num2);
    String showMinusOperation(int num1, int num2);
    String showMultiplyOperation(int num1, int num2);
    String showDivideOperation(int num1, int num2);
}
