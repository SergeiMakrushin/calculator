package com.example.calculator.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.context.annotation.RequestScope;

@Repository
@RequestScope
public class CalculatorRepository {


    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public int subtraction(int num1, int num2) {
        int subtraction = num1 - num2;
        return subtraction;
    }


    public int multiplication(int num1, int num2) {
        int multiplication = num1 * num2;
        return multiplication;
    }


    public int division(int num1, int num2) {


        int division = num1 / num2;
        return division;

    }
}
