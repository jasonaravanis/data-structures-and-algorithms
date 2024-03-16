package org.example;

import java.util.Arrays;

public class MergeSort {

    private static void merge(int[] array, int[] left, int[] right) {
        // i: left iterator
        // j: right iterator
        // k: result iterator
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        // account for possible elements remaining in left
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }
        // account for possible elements remaining in right
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] array) {
        if (array.length < 2) {
            return;
        }

        int pivot = Math.floorDiv(array.length, 2);
        int[] left = Arrays.copyOfRange(array, 0, pivot);
        int [] right = Arrays.copyOfRange(array, pivot, array.length);

        sort(left);
        sort(right);
        merge(array, left, right);
    }
}