package com.mycompany.oopsconcept;

public class Calculator {
    /**
     * Divides two integers and returns the result
     *
     * @param a the numerator
     * @param b the denominator
     * @return the result of division
     * @throws ArithmeticException if the denominator is zero
     */
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        return a / b;
    }

    /**
     * Calculates the square root of an integer and returns the result
     *
     * @param a the number to find the square root of
     * @return the square root of the number
     * @throws NegativeNumberException if the number is negative
     */
    public static int squareRoot(int a) throws NegativeNumberException {
        if (a < 0) {
            throw new NegativeNumberException("Number cannot be negative");
        }
        return (int) Math.sqrt(a);
    }
}

