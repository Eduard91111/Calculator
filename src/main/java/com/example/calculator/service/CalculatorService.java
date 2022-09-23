package com.example.calculator.service;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int plus(Integer a, Integer b) {
        return a+b;
    }

    public int minus(Integer a, Integer b) {
        return a-b;
    }

    public int multiplication(Integer a, Integer b) {
        return a*b;
    }

    public double division(Integer a, Integer b) {
        return a/b;
    }
}
