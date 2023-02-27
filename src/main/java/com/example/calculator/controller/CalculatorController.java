package com.example.calculator.controller;

import com.example.calculator.service.CalculatorServiseImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class CalculatorController {
    private final CalculatorServiseImpl calculatorServiseImpl;
    public CalculatorController (CalculatorServiseImpl calculatorServiseImpl) {
        this.calculatorServiseImpl = calculatorServiseImpl;
    }
    @GetMapping("/calculator")
    public String hello() {
        return this.calculatorServiseImpl.hello();
    }

    @GetMapping("/calculator/plus")
    public int sumCalculator(@RequestParam ("num1") int num1,@RequestParam ("num2") int num2) {
        return this.calculatorServiseImpl.sum(num1,num2);
    }

    @GetMapping ("/calculator/substraction")
    public int substractionCalculator (@RequestParam ("num1")int num1,@RequestParam ("num2") int num2) {
        return this.calculatorServiseImpl.subtraction(num1,num2);
    }
    @GetMapping ("/calculator/multiplication")
    public int multiplicationCalculator (@RequestParam ("num1")int num1,@RequestParam ("num2") int num2) {
        return this.calculatorServiseImpl.multiplication(num1,num2);
    }

    @GetMapping ("/calculator/division")
    public int divisionCalculator (@RequestParam ("num1")int num1,@RequestParam ("num2") int num2) {
        return this.calculatorServiseImpl.division(num1,num2);
    }



}
//@GetMapping("/calculator/plus")
//    public int sum(@RequestParam ("num1") int num1,@RequestParam ("num2") int num2) {
//        return this.calculatorServise.sum(num1,num2);
//    }
// private final CalculatorRepository calculatorRepository;
//    public CalculatorController (CalculatorRepository calculatorRepository) {
//        this.calculatorRepository = calculatorRepository;
//    }


// <dependency>
//            <groupId>org.junit.jupiter</groupId>
//            <artifactId>junit-jupiter-params</artifactId>
//            <version>5.8.1</version>
//            <scope>test</scope>
//        </dependency>

