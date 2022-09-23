package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalculatorController {

    private final CalculatorService calculatorService;

    @RequestMapping("/сalculator/plus")
    public String plus (@RequestParam (name = "num1") Integer a, @RequestParam (name = "num2") Integer b) {
        int plus = calculatorService.plus(a,b);
        return a + " + " + b + " = " + plus;
    }
    @RequestMapping("/сalculator/minus")
    public String minus (@RequestParam (name = "num1") Integer a, @RequestParam (name = "num2") Integer b) {
        int minus = calculatorService.minus(a,b);
        return a + " - " + b + " = " + minus;
    }
    @RequestMapping("/сalculator/multiplication")
    public String multiplication (@RequestParam (name = "num1") Integer a, @RequestParam (name = "num2") Integer b) {
        int multiplication = calculatorService.multiplication(a,b);
        return a + " * " + b + " = " + multiplication;
    }
    @RequestMapping("/сalculator/division")
    public String division (@RequestParam (name = "num1") Integer a, @RequestParam (name = "num2") Integer b) {
        double division = calculatorService.division(a,b);
        return a + " : " + b + " = " + division;
    }

}
