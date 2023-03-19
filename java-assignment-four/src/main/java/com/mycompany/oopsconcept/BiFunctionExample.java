package com.mycompany.oopsconcept;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public String combineStrings(String str1, String str2) {

        // create a BiFunction to combine two strings with a space in between
        BiFunction<String, String, String> combineStrings = (s1, s2) -> s1 + " " + s2;

        // use the BiFunction to combine two strings
        String combined = combineStrings.apply(str1, str2);

        return combined;
    }
}
