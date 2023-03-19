package com.mycompany.oopsconcept;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static org.testng.AssertJUnit.assertTrue;

public class ConsumerDemoTest {

    private ConsumerDemo consumerDemo = null;

    @BeforeTest
    public void init(){
        consumerDemo = new ConsumerDemo();
    }


    @Test
    public void testConsumerDemoMethod() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Consumer<Integer> addTen = number -> {
            number += 10;
            System.out.print(number + " ");
        };
        numbers.forEach(addTen);

        assertTrue(numbers.containsAll(consumerDemo.consumerDemoMethod(numbers)));
    }
}

