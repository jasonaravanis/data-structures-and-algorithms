package org.example;

import java.util.Arrays;

public class InsertionSort {

    // O(n**2)
    // But if the list is already nearly sorted, insertion sort is an efficient choice because it's time complexity
    // becomes O(n)

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] sort(int[] array) {
        int whileLoopCount = 0;
        for (int i = 1; i < array.length; i++) {
            int pivotValue = array[i];
            while (i > 0 && array[i - 1] > pivotValue) {
                array[i] = array[i - 1];
                i--;
                whileLoopCount++;
            }
            array[i] = pivotValue;
            System.out.println(Arrays.toString(array));
        }
        System.out.println("While loop count: " + whileLoopCount);
        return array;
    }
}