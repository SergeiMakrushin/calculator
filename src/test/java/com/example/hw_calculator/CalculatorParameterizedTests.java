package com.example.hw_calculator;


import com.example.hw_calculator.service.CalculatorServiseImpl;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParameterizedTests {
    private final CalculatorServiseImpl calculatorServise = new CalculatorServiseImpl();

    //    public static Stream<Arguments>
    @ParameterizedTest
    @CsvSource({
            "6,2,3",
            "10,5,2",
            "5,0,2"
    })
    void parameterizedTestDivision(int first, int second, int result) {
        assertEquals(result, calculatorServise.division(first, second));
    }

    @ParameterizedTest
    @CsvSource({
            "6,2,8",
            "10,5,15",
            "5,0,5"
    })
    void parameterizedTestSum(int first, int second, int result) {
        assertEquals(result, calculatorServise.sum(first, second));
    }

    @ParameterizedTest
    @CsvSource({
            "6,2,12",
            "10,5,50",
            "5,0,0"
    })
    void parameterizedTestMultiplication(int first, int second, int result) {
        assertEquals(result, calculatorServise.multiplication(first, second));
    }

    @ParameterizedTest
    @CsvSource({
            "6,2,4",
            "10,5,5",
            "5,0,5"
    })
    void parameterizedTestSubtraction(int first, int second, int result) {
        assertEquals(result, calculatorServise.subtraction(first, second));
    }


}
