package com.mycompany.oopsconcept;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondLargestNumberInArrayTest {

    SecondLargestNumberInArray secondLargestNumberInArray = null;

    @BeforeTest
    public void init(){
        secondLargestNumberInArray = new SecondLargestNumberInArray();
    }

    @Test(description = "The 2nd largest number was found correctly")
    public void testFindSecondLargest() {
        int[] numbers = {11, 15, 8, 20, 12, 17, 25};
        int expectedSecondLargest = 20;
        int actualSecondLargest = secondLargestNumberInArray.findSecondLargest(numbers);
        Assert.assertEquals(actualSecondLargest, expectedSecondLargest, "This is not Second largest number");
    }
}
