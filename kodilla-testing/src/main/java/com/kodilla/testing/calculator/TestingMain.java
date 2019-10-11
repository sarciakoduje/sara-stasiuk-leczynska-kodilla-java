package com.kodilla.testing.calculator;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(10, 12);
        int resultSub = calculator.substract(500, 250);

        if (resultAdd == 22 && resultSub == 250) {
            System.out.println("Calculator test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
