package com.mycompany.oopsconcept;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {

    public List<String> convertUpperCase(List<String> words) {
        // create a function to convert a string to uppercase
        Function<String, String> toUpperCase = String::toUpperCase;

        // use the function to convert each word in the list to uppercase
        List<String> upperCaseWords = convertList(words, toUpperCase);

        // print the original list
        System.out.println("Original List: " + words);
        return upperCaseWords;
    }

    public static <T, R> List<R> convertList(List<T> list, Function<T, R> function) {
        return list.stream().map(function).collect(Collectors.toList());
    }
}

