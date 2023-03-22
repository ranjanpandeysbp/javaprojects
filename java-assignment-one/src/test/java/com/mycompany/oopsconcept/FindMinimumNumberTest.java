package com.mycompany.oopsconcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindMinimumNumberTest {

    @Test
    public void testFindMinimumNumber() {
        FindMinimumNumber finder = new FindMinimumNumber();
        int[] numbers = {5, 2, 8, 1, 9};
        int expectedMinimum = 1;
        int actualMinimum = finder.findMinimumNumber(numbers);
        Assert.assertEquals(actualMinimum, expectedMinimum);
    }

    @Test
    public void testFindMinimumNumberWithEmptyArray() {
        FindMinimumNumber finder = new FindMinimumNumber();
        int[] numbers = {};
        int expectedMinimum = Integer.MAX_VALUE;
        int actualMinimum = finder.findMinimumNumber(numbers);
        Assert.assertEquals(actualMinimum, expectedMinimum);
    }

    @Test
    public void testFindMinimumNumberWithNegativeNumbers() {
        FindMinimumNumber finder = new FindMinimumNumber();
        int[] numbers = {-5, -2, -8, -1, -9};
        int expectedMinimum = -9;
        int actualMinimum = finder.findMinimumNumber(numbers);
        Assert.assertEquals(actualMinimum, expectedMinimum);
    }
}

