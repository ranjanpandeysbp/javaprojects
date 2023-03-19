package com.mycompany.oopsconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FunctionalInterfaceDemo functionalInterfaceDemo = new FunctionalInterfaceDemo();
        double areaOfCircle = functionalInterfaceDemo.areaCircle(5);
        System.out.println("Area of circle is " + areaOfCircle);

        PredicateDemo pd = new PredicateDemo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        pd.drivingCheck(scanner.nextInt());

        ConsumerDemo consumerDemo = new ConsumerDemo();
        // create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        consumerDemo.consumerDemoMethod(numbers);

        // create a list of strings
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        FunctionExample functionExample = new FunctionExample();
        System.out.println("Uppercase List: " + functionExample.convertUpperCase(words));

        BiFunctionExample biFunctionExample = new BiFunctionExample();
        // print the combined string
        System.out.println(biFunctionExample.combineStrings("Hi", "I am your friend."));

    }
}

