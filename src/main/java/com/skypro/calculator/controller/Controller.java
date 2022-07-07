package com.skypro.calculator.controller;


import com.skypro.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String greeting() {
        return calculatorService.greeting();
    }

    @GetMapping("/plus")
    public String showPlusOperation(int num1, int num2) {
        return calculatorService.showPlusOperation(num1, num2);
    }

    @GetMapping("/minus")
    public String showMinusOperation(int num1, int num2) {
        return calculatorService.showMinusOperation(num1, num2);
    }

    @GetMapping("/multiply")
    public String showMultiplyOperation(int num1, int num2) {
        return calculatorService.showMultiplyOperation(num1, num2);
    }

    @GetMapping("/divide")
    public String showDivideOperation(int num1, int num2) {
        return calculatorService.showDivideOperation(num1, num2);
    }
}
