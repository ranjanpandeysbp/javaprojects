package com.mycompany.oopsconcept;

import java.util.Arrays;

public class SecondLargestNumberInArray {

    public int findSecondLargest(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 2];
    }
}
