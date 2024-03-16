package org.example;

public class BinarySearchNew {

    public static boolean binarySearch(int[] array, int needle) {

        int lo = 0;
        int hi = array.length - 1;

        while (lo <= hi) {
            int pivot  = Math.floorDiv(lo + hi, 2);
            if (array[pivot] == needle) {
                return true;
            }
            if (array[pivot] > needle) {
                hi = pivot - 1;
                continue;
            }
            if (array[pivot] < needle) {
                lo = pivot + 1;
                continue;
            }
        }


        return false;
    }



    private static boolean binarySearchRecursiveWalk(int[] array, int hi, int lo, int needle) {
        int pivot = Math.floorDiv(lo + hi, 2);
        if (array[pivot] == needle) {
            return true;
        }
        if (hi == lo) {
            return false;
        }
        if (array[pivot] > needle) {
            return binarySearchRecursiveWalk(array, pivot - 1, lo, needle);
        }
        if (array[pivot] < needle) {
            return binarySearchRecursiveWalk(array, hi, pivot + 1, needle);
        }

        return false;
    }

    public static boolean binarySearchRecursive(int[] array, int needle) {
        return binarySearchRecursiveWalk(array, array.length - 1, 0, needle);
    }
}