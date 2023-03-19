package com.mycompany.oopsconcept;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssignmentThreeTest {
    private AssignmentThree example;

    @BeforeClass
    public void setUp() {
        example = new AssignmentThree("John", 25);
    }

    @Test(description = "Tests if the toString method returns the expected string.")
    public void testToString() {
        String expectedString = "AssignmentThree{name='John', age=25}";
        Assert.assertEquals(example.toString(), expectedString);
    }

    @Test(description = "Tests the finalMethod method.")
    public void testFinalMethod() {
        example.finalMethod();
    }

    @Test(description = "Tests the nonFinalMethod method.")
    public void testNonFinalMethod() {
        AssignmentThree child = new AssignmentThree("Jane", 30);
        child.overloadMethod();
    }

    @Test(description = "Test getInstanceCount method returns the expected result.")
    public void testStaticMethod() {
        int expectedCount = 1;
        int result = AssignmentThree.getInstanceCount();
        Assert.assertEquals(result, expectedCount++);
    }
}
