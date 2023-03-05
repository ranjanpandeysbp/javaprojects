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

    @Test(description = "Tests if the constructor sets the name and age correctly.")
    public void testConstructor() {
        Assert.assertEquals(example.getName(), "John");
        Assert.assertEquals(example.getAge(), 25);
    }

    @Test(description = "Tests if the setAge method updates the age correctly.")
    public void testSetAge() {
        example.setAge(30);
        Assert.assertEquals(example.getAge(), 30);
    }

    @Test(description = "Tests if the toString method returns the expected string.")
    public void testToString() {
        String expectedString = "AssignmentThree{name='John', age=25}";
        Assert.assertEquals(example.toString(), expectedString);
    }

    @Test(description = "Tests if the genericMethod method returns the expected result when passed an integer.")
    public void testGenericMethod() {
        int parameter = 10;
        int expectedResult = 10;
        int result = example.genericMethod(parameter);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(description = "Tests the finalMethod method.")
    public void testFinalMethod() {
        example.finalMethod();
    }

    @Test(description = "Tests the nonFinalMethod method.")
    public void testNonFinalMethod() {
        AssignmentThree child = new AssignmentThree("Jane", 30);
        child.nonFinalMethod();
    }

    @Test(description = "Test getInstanceCount method returns the expected result.")
    public void testStaticMethod() {
        int expectedCount = 1;
        int result = AssignmentThree.getInstanceCount();
        Assert.assertEquals(result, expectedCount++);
    }
}
