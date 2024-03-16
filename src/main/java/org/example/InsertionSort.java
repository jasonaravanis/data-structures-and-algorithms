package org.example;

public class InsertionSort {

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int pivotValue = array[i];
            int j = i - 1;
            while (j > 0) {
                if (array[j] > pivotValue) {
                    swap(array, j, j + 1);
                }
                j--;
            }
            array[j] = pivotValue;
        }

        return array;
    }
}