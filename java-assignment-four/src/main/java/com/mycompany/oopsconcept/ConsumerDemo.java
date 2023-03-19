package com.mycompany.oopsconcept;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public List<Integer> consumerDemoMethod(List<Integer> numbers){
        // create a consumer to add 10 to each number in the list
        Consumer<Integer> addTen = number -> {
            number += 10;
            System.out.print(number + " ");
        };

        // use the consumer to modify the list of numbers
        System.out.print("Original List: ");
        numbers.forEach(addTen);
        return numbers;
    }
}
