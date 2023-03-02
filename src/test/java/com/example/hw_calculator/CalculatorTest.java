package com.example.hw_calculator;

import com.example.hw_calculator.model.CalculatorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final CalculatorRepository calculatorRepository = new CalculatorRepository();

    @Test
    public void divisionTest() {
        int result = calculatorRepository.division(6, 2);
        Assertions.assertEquals(3, result);
    }
    @Test
    public void sumTest() {
        int result = calculatorRepository.sum(6, 2);
        Assertions.assertEquals(8,result);
    }

    @Test
    public void multiplicationTest() {
        int result = calculatorRepository.multiplication(6, 2);
        Assertions.assertEquals(12,result);
    }

    @Test
    public void substractionTest() {
        int result = calculatorRepository.subtraction(6, 2);
        Assertions.assertEquals(4,result);
    }


}
