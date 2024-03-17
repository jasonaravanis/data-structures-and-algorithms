package org.example;

public class BinarySearchNew {


    private static boolean recursiveSearch(int[] array, int low, int high, int needle) {
        if (high < low) {
            return false;
        }
        int pivot = Math.floorDiv(low + high, 2);
        if (needle == array[pivot]) {
            return true;
        }
        if (needle < array[pivot]) {
            return recursiveSearch(array, low, pivot - 1, needle);
        }
        if (needle > array[pivot]) {
            return recursiveSearch(array, pivot + 1, high, needle);
        }
        return false;
    }

    public static boolean search(int[] array, int needle) {
        return recursiveSearch(array, 0, array.length - 1, needle);
    }
}