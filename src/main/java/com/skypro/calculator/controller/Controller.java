package com.skypro.calculator.controller;


import com.skypro.calculator.service.CalculaterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final CalculaterService calculaterService;

    public Controller(CalculaterService calculaterService) {
        this.calculaterService = calculaterService;
    }

    @GetMapping()
    public String greeting() {
        return calculaterService.greeting();
    }

    @GetMapping("/plus")
    public String showPlusOperation(int num1, int num2) {
        return calculaterService.showPlusOperation(num1, num2);
    }

    @GetMapping("/minus")
    public String showMinusOperation(int num1, int num2) {
        return calculaterService.showMinusOperation(num1, num2);
    }

    @GetMapping("/multiply")
    public String showMultiplyOperation(int num1, int num2) {
        return calculaterService.showMultiplyOperation(num1, num2);
    }

    @GetMapping("/divide")
    public String showDivideOperation(int num1, int num2) {
        return calculaterService.showDivideOperation(num1, num2);
    }
}
