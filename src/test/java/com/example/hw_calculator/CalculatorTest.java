package com.example.hw_calculator;


import com.example.hw_calculator.service.CalculatorServiseImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContextException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private final CalculatorServiseImpl calculatorServise = new CalculatorServiseImpl();

    @Test
    void checkExceptionDivision() {
        assertThrows(ApplicationContextException.class,
                () -> calculatorServise.division(1, 0), "НЕПРАВИЛЬНОЕ ИСКЛЮЧЕНИЕ, ТРЕБУЕТСЯ IllegalArgumentException"
        );
    }

    @Test
    public void divisionTest() {
        int result = calculatorServise.division(6, 1);
        assertEquals(6, result);
    }
    @Test
    public void divisionTest2() {
        int result = calculatorServise.division(5, 0);
        assertEquals(6, result);
    }



    @Test
    public void sumTest() {
        int result = calculatorServise.sum(6, 2);
        assertEquals(8, result);

    }
    @Test
    public void sumTest2() {
        int result = calculatorServise.sum(10, 10);
        assertEquals(20, result);

    }


    @Test
    public void multiplicationTest() {
        int result = calculatorServise.multiplication(6, 2);
        assertEquals(12, result);
    }
    @Test
    public void multiplicationTest2() {
        int result = calculatorServise.multiplication(4, 4);
        assertEquals(16, result);
    }


    @Test
    public void subtractionTest() {
        int result = calculatorServise.subtraction(6, 2);
        assertEquals(4, result);
    }
    @Test
    public void subtractionTest2() {
        int result = calculatorServise.subtraction(3, 1);
        assertEquals(2, result);
    }

}
