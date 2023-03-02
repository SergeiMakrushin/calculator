package com.example.calculator.service;

import com.example.calculator.model.CalculatorRepository;
import org.springframework.stereotype.Service;
@Service
public class CalculatorServiseImpl implements CalculatorServise {

private final CalculatorRepository calculatorRepository;
public CalculatorServiseImpl (CalculatorRepository calculatorRepository){
    this.calculatorRepository=calculatorRepository;
}
    @Override
    public String hello() {
        return this.calculatorRepository.hello();
    }

    @Override
    public int sum(int num1, int num2) {
        return this.calculatorRepository.sum(num1,num2);
    }

    @Override
    public int subtraction(int num1, int num2) {
        return this.calculatorRepository.subtraction(num1,num2);
    }

    @Override
    public int multiplication(int num1, int num2) {
        return this.calculatorRepository.multiplication(num1,num2);
    }

    @Override
    public int division(int num1, int num2) {
        if (num2 == 0) {
            try {
                throw new Exception("Нельзя делить на 0");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return this.calculatorRepository.division(num1, num2);
    }
}
