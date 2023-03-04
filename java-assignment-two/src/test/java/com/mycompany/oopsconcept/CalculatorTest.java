package com.mycompany.oopsconcept;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CalculatorTest {

    Calculator calculator = null;

    @BeforeTest
    public void init(){
        calculator = new Calculator();
    }
    @Test
    public void testAdd(){
        Double expectedSum = 9.0;
        Double result = calculator.add(5.5, 3.5);
        Assert.assertEquals(result, expectedSum, "Sum of two numbers is incorrect.");
    }
    @Test
    public void testMultiply(){
        Double expectedResult = 6.0;
        Double result = calculator.multiply(3.0, 2.0);
        Assert.assertEquals(result, expectedResult, "Multiplication of two numbers is incorrect.");
    }
}
