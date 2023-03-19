package com.mycompany.oopsconcept;

public class ExceptionHandler {
    /**
     * Demonstrates how to catch and handle an ArithmeticException
     */
    public static void handleArithmeticException() {
        try {
            int result = Calculator.divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }

    /**
     * Demonstrates how to catch and handle a NegativeNumberException
     */
    public static void handleNegativeNumberException() {
        try {
            int result = Calculator.squareRoot(-10);
            System.out.println("Result: " + result);
        } catch (NegativeNumberException e) {
            System.out.println("Caught NegativeNumberException: " + e.getMessage());
        }
    }

    /**
     * Demonstrates how to catch and handle multiple exceptions
     */
    public static void handleMultipleExceptions() {
        try {
            int result1 = Calculator.divide(10, 0);
            System.out.println("Result1: " + result1);

            int result2 = Calculator.squareRoot(-10);
            System.out.println("Result2: " + result2);
        } catch (ArithmeticException | NegativeNumberException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    /**
     * Demonstrates how to rethrow an exception
     *
     * @throws NegativeNumberException if a negative number is encountered
     */
    public static void rethrowException() throws NegativeNumberException {
        try {
            int result = Calculator.squareRoot(-10);
            System.out.println("Result: " + result);
        } catch (NegativeNumberException e) {
            System.out.println("Caught NegativeNumberException: " + e.getMessage());
            throw e;
        }
    }
}

