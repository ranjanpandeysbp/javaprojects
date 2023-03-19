package com.mycompany.oopsconcept;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MethodChainingTest {

    private MethodChaining example;

    @BeforeClass
    public void setUp() {
        example = new MethodChaining("John", 25);
    }
    @Test(description = "Tests if the setAge method updates the age correctly.")
    public void testSetAge() {
        example.setAge(30);
        Assert.assertEquals(example.getAge(), 30);
    }
}
