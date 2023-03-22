package com.mycompany.oopsconcept;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        SecondLargestNumberInArray secondLargestNumberInArray = new SecondLargestNumberInArray();
        int[] numbers = {11, 15, 8, 20, 12, 17, 25};
        int actualSecondLargest = secondLargestNumberInArray.findSecondLargest(numbers);
        System.out.println("The second largest number is: "+actualSecondLargest);

        //Find minimum number in array
        FindMinimumNumber findMinimumNumber = new FindMinimumNumber();
        int minimumNumber = findMinimumNumber.findMinimumNumber(numbers);
        System.out.println("The minimum number is: " + minimumNumber);

        //Sorting using Selection Sort
        int[] sortedArray = SelectionSort.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));

    }
}
