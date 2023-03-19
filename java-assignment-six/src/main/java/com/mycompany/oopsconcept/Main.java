package com.mycompany.oopsconcept;

public class Main {

    public static void main(String[] args) {
        try {
            int result = Calculator.divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }

        try {
            int result = Calculator.squareRoot(-10);
            System.out.println("Result: " + result);
        } catch (NegativeNumberException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }

        try {
            int result = Calculator.divide(10, 2);
            System.out.println("Result: " + result);
            int sqrtResult = Calculator.squareRoot(-10);
            System.out.println("Square root result: " + sqrtResult);
        } catch (ArithmeticException | NegativeNumberException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }

        try {
            ExceptionHandler.rethrowException();
        } catch (NegativeNumberException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }

        ExceptionHandler.handleArithmeticException();
        ExceptionHandler.handleNegativeNumberException();
        ExceptionHandler.handleMultipleExceptions();
    }
}
