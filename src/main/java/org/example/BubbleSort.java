package org.example;

import java.util.Arrays;

public class BubbleSort {

//    O(n^2)

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] sortWhile(int[] array) {

        // for each number in the array
        // if it is larger than the next number, swap their positions
        // repeat this process while swaps still occur. If no swap occurs, we are done
        boolean finished = false;

        while (!finished) {
            boolean swapHappened = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapHappened = true;
                }
            }
            if (!swapHappened) {
                finished = true;
                break;
            }
            System.out.println("Progress: " + Arrays.toString(array));
        }

        return array;
    }

    public static int[] sort(int [] array) {

        for (int i = 0; i < array.length - 1; i++) {
            boolean noSwaps = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                System.out.println("i: " + i + " " + "j: " + j);
                System.out.println("Array Before: " + Arrays.toString(array));
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    noSwaps = false;
                }
                System.out.println("Array After: " + Arrays.toString(array));
            }
            if (noSwaps) {
                break;
            }
        }
        return array;
    }
}


//for (int j = 0; j < array.length - 1 - i; j++) {
//
//        }