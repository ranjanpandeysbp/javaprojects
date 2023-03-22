package com.mycompany.oopsconcept;

import java.util.Arrays;

public class FindMinimumNumber {
    public int findMinimumNumber(int[] numbers) {
        int min = Integer.MAX_VALUE;
        if(null != numbers && numbers.length > 0)
            min = Arrays.stream(numbers).min().getAsInt();
        return min;
    }
}
