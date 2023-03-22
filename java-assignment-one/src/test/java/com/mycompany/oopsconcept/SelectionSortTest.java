package com.mycompany.oopsconcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectionSortTest {

    @Test
    public void testSort() {
        int[] arr = {5, 2, 8, 1, 9};
        int[] expectedArr = {1, 2, 5, 8, 9};
        int[] sortedArr = SelectionSort.sort(arr);
        Assert.assertEquals(sortedArr, expectedArr);
    }

    @Test
    public void testSortWithEmptyArray() {
        int[] arr = {};
        int[] expectedArr = {};
        int[] sortedArr = SelectionSort.sort(arr);
        Assert.assertEquals(sortedArr, expectedArr);
    }

    @Test
    public void testSortWithDuplicates() {
        int[] arr = {5, 2, 8, 1, 5};
        int[] expectedArr = {1, 2, 5, 5, 8};
        int[] sortedArr = SelectionSort.sort(arr);
        Assert.assertEquals(sortedArr, expectedArr);
    }

    @Test
    public void testSortWithNegativeNumbers() {
        int[] arr = {-5, 2, 8, -1, 9};
        int[] expectedArr = {-5, -1, 2, 8, 9};
        int[] sortedArr = SelectionSort.sort(arr);
        Assert.assertEquals(sortedArr, expectedArr);
    }
}

