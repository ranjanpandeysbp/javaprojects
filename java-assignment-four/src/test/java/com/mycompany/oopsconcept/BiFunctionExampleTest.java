package com.mycompany.oopsconcept;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.function.BiFunction;

import static org.testng.AssertJUnit.assertEquals;

public class BiFunctionExampleTest {
    private BiFunctionExample biFunctionExample = null;

    @BeforeTest
    public void init(){
        biFunctionExample = new BiFunctionExample();
    }

    @Test
    public void testCombineStrings() {
        // create a BiFunction to combine two strings with a space in between
        BiFunction<String, String, String> combineStrings = (s1, s2) -> s1 + " " + s2;

        // test the method with some sample inputs
        String result1 = biFunctionExample.combineStrings("Hello", "World");
        String result2 = biFunctionExample.combineStrings("Java", "8");
        String result3 = biFunctionExample.combineStrings("BiFunction", "Example");

        // assert that the results are correct
        assertEquals(result1, "Hello World");
        assertEquals(result2, "Java 8");
        assertEquals(result3, "BiFunction Example");
    }
}
