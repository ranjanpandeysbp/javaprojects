package com.mycompany.oopsconcept;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.function.Predicate;

public class PredicateDemoTest {

    PredicateDemo predicateDemo = null;

    @BeforeTest
    public void init(){
        predicateDemo = new PredicateDemo();
    }

    @Test
    public void testDrivingCheck() {
        Predicate<Integer> drivingAge = age -> age >= 18;
        int inputAge = 25;
        boolean expectedDrivingStatus = true;
        boolean actualDrivingStatus = predicateDemo.drivingCheck(inputAge);
        Assert.assertEquals(actualDrivingStatus, expectedDrivingStatus,
                "Driving status is not as expected");
    }
}
