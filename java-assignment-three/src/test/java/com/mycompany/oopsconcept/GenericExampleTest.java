package com.mycompany.oopsconcept;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GenericExampleTest {

    private GenericExample example;

    @BeforeClass
    public void setUp() {
        example = new GenericExample();
    }

    @Test(description = "Tests if the genericMethod method returns the expected result when passed an integer.")
    public void testGenericMethod() {
        int parameter = 10;
        int expectedResult = 10;
        int result = example.genericMethod(parameter);
        Assert.assertEquals(result, expectedResult);
    }
}
