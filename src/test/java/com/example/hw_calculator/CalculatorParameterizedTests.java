package com.example.hw_calculator;

import com.example.hw_calculator.model.CalculatorRepository;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParameterizedTests {
    private final CalculatorRepository calculatorRepository = new CalculatorRepository();

    //    public static Stream<Arguments>
    @ParameterizedTest
    @CsvSource({
            "6,2,3",
            "10,5,2",
            "5,0,2"
    })
    void parameterizedTestDivision(int first, int second, int result) {
        assertEquals(result, calculatorRepository.division(first, second));
    }
    @ParameterizedTest
    @CsvSource({
            "6,2,8",
            "10,5,15",
            "5,0,5"
    })
    void parameterizedTestSum(int first, int second, int result) {
        assertEquals(result, calculatorRepository.sum(first, second));
    }

    @ParameterizedTest
    @CsvSource({
            "6,2,12",
            "10,5,50",
            "5,0,0"
    })
    void parameterizedTestMultiplication(int first, int second, int result) {
        assertEquals(result, calculatorRepository.multiplication(first, second));
    }

    @ParameterizedTest
    @CsvSource({
            "6,2,4",
            "10,5,5",
            "5,0,5"
    })
    void parameterizedTestSubtraction(int first, int second, int result) {
        assertEquals(result, calculatorRepository.subtraction(first, second));
    }


}
