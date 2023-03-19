package com.mycompany.oopsconcept;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.testng.AssertJUnit.assertEquals;

public class FunctionExampleTest {

    private FunctionExample functionExample = null;

    @BeforeTest
    public void init(){
        functionExample = new FunctionExample();
    }

    @Test
    public void testConvertList() {
        // create a list of strings
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        // create a function to convert a string to uppercase
        Function<String, String> toUpperCase = String::toUpperCase;

        // use the function to convert each word in the list to uppercase
        List<String> upperCaseWords = functionExample.convertUpperCase(words);

        // assert that the list was converted correctly
        List<String> expectedList = Arrays.asList("APPLE", "BANANA", "CHERRY", "DATE");
        assertEquals(upperCaseWords, expectedList);
    }
}
