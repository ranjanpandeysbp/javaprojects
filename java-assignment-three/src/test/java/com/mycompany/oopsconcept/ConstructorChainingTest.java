package com.mycompany.oopsconcept;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConstructorChainingTest {
    private ConstructorChaining example;

    @BeforeClass
    public void setUp() {
        example = new ConstructorChaining("John", 25);
    }

    @Test(description = "Tests if the constructor sets the name and age correctly.")
    public void testConstructor() {
        Assert.assertEquals(example.getName(), "John");
        Assert.assertEquals(example.getAge(), 25);
    }
}
