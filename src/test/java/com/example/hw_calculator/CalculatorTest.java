package com.example.hw_calculator;

import com.example.hw_calculator.model.CalculatorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContextException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private final CalculatorRepository calculatorRepository = new CalculatorRepository();

    @Test
    void checkExceptionDivision() {
        assertThrows(ApplicationContextException.class,
                () -> calculatorRepository.division(1, 0), "НЕПРАВИЛЬНОЕ ИСКЛЮЧЕНИЕ, ТРЕБУЕТСЯ IllegalArgumentException"
        );
    }

    @Test
    public void divisionTest() {
        int result = calculatorRepository.division(6, 1);
        assertEquals(6, result);
    }
    @Test
    public void divisionTest2() {
        int result = calculatorRepository.division(5, 0);
        assertEquals(6, result);
    }



    @Test
    public void sumTest() {
        int result = calculatorRepository.sum(6, 2);
        assertEquals(8, result);

    }
    @Test
    public void sumTest2() {
        int result = calculatorRepository.sum(10, 10);
        assertEquals(20, result);

    }


    @Test
    public void multiplicationTest() {
        int result = calculatorRepository.multiplication(6, 2);
        assertEquals(12, result);
    }
    @Test
    public void multiplicationTest2() {
        int result = calculatorRepository.multiplication(4, 4);
        assertEquals(16, result);
    }


    @Test
    public void subtractionTest() {
        int result = calculatorRepository.subtraction(6, 2);
        assertEquals(4, result);
    }
    @Test
    public void subtractionTest2() {
        int result = calculatorRepository.subtraction(3, 1);
        assertEquals(2, result);
    }

}
