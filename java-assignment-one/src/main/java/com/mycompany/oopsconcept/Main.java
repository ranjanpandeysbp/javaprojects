package com.mycompany.oopsconcept;

public class Main {

    public static void main(String[] args){

        SecondLargestNumberInArray secondLargestNumberInArray = new SecondLargestNumberInArray();
        int[] numbers = {11, 15, 8, 20, 12, 17, 25};
        int actualSecondLargest = secondLargestNumberInArray.findSecondLargest(numbers);
        System.out.println("The second largest number is: "+actualSecondLargest);
    }
}
