package com.mycompany.oopsconcept;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CalculatorTest {

    @Test
    public void testDivide() {
        int result = Calculator.divide(10, 5);
        assertEquals(result, 2);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator.divide(10, 0);
    }

    @Test
    public void testSquareRoot() throws NegativeNumberException {
        int result = Calculator.squareRoot(16);
        assertEquals(result, 4);
    }

    @Test(expectedExceptions = NegativeNumberException.class)
    public void testNegativeSquareRoot() throws NegativeNumberException {
        Calculator.squareRoot(-16);
    }
}

