package com.example.hw_calculator.controller;

import com.example.hw_calculator.service.CalculatorServiseImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class CalculatorController {
    private final CalculatorServiseImpl calculatorServiseImpl;

    public CalculatorController(CalculatorServiseImpl calculatorServiseImpl) {
        this.calculatorServiseImpl = calculatorServiseImpl;
    }

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<String> exeptionHandler(Exception e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @GetMapping("/calculator")
    public String hello() {

        return this.calculatorServiseImpl.hello();
    }

    @GetMapping("/calculator/plus")
    public String sumCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = calculatorServiseImpl.sum(num1, num2);
        String sum = num1 + " + " + num2 + " = " + result;
        return sum;
    }

    @GetMapping("/calculator/substraction")
    public String substractionCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = calculatorServiseImpl.subtraction(num1, num2);
        String substraction = num1 + " - " + num2 + " = " + result;
        return substraction;

    }

    @GetMapping("/calculator/multiplication")
    public String multiplicationCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = calculatorServiseImpl.multiplication(num1, num2);
        String multiplication = num1 + " * " + num2 + " = " + result;
        return multiplication;
    }

    @GetMapping("/calculator/division")
    public String divisionCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = calculatorServiseImpl.division(num1, num2);
        String division = num1 + " / " + num2 + " = " + result;
        return division;
    }


}

