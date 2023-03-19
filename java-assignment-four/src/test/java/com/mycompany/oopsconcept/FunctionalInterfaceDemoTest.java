package com.mycompany.oopsconcept;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FunctionalInterfaceDemoTest {

    FunctionalInterfaceDemo functionalInterfaceDemo = null;

    @BeforeTest
    public void init(){
        functionalInterfaceDemo = new FunctionalInterfaceDemo();
    }

    @Test(description = "Calculate the area of the circle")
    public void testAreaCircle() {
        Circle circle = r -> 3.14 * r * r;
        double radius = 2.0;
        double expectedArea = 3.14 * radius * radius;
        double actualArea = circle.area(radius);
        Assert.assertEquals(actualArea, expectedArea,
                "The calculated area of the circle is not correct");
    }
}
