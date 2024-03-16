package org.example;

public class BinarySearch {

    // O(n * log(n))

    // how to do generics?
    public static boolean binarySearch(int[] array, int needle) {

        int lo = 0;
        int hi = array.length - 1;
        while (lo <= hi) {
            int pivot = Math.floorDiv(lo + hi, 2);
            if (array[pivot] == needle) {
                return true;
            }
            if (array[pivot] > needle) {
                hi = pivot - 1;
            }
            if (array[pivot] < needle) {
                lo = pivot + 1;
            }
        }

        return false;
    }


    private static boolean binarySearchRecursive(int[] array, int lo, int hi, int needle) {
        int pivot = Math.floorDiv(lo + hi, 2);
        if (array[pivot] == needle) {
            return true;
        }
        if (array[pivot] > needle) {
            return binarySearchRecursive(array, lo, pivot - 1, needle);
        }
        if (array[pivot] < needle) {
            return binarySearchRecursive(array, pivot + 1, hi, needle);
        }
        return false;
    }
    public static boolean binarySearchRecursive(int[] array, int needle) {
        return binarySearchRecursive(array, 0, array.length -1, needle);
    }

    public static boolean binarySearch(String[] array, String needle) {
        // assume the array is in alphabetical order
        int lo = 0;
        int hi = array.length - 1;

        char[] needleArray = needle.toCharArray();

        int loopCount = 0;

        while (lo <= hi) {
            int pivotIndex = Math.floorDiv(lo + hi, 2);
            String pivot = array[pivotIndex];
            if (pivot.equals(needle)) {
                return true;
            }
            char[] pivotArray = pivot.toCharArray();
            for (int i = 0; i < pivot.length(); i++) {
                char pivotSymbol = pivotArray[i];
                char needleSymbol = needleArray[i];

                if ((int) pivotSymbol == (int) needleSymbol) {
                    continue;
                }

                if ((int) pivotSymbol < (int) needleSymbol) {
                    lo = pivotIndex + 1;
                    break;
                }
                if ((int) pivotSymbol > (int) needleSymbol) {
                    hi = pivotIndex - 1;
                    break;
                }
            }
            loopCount++;
            System.out.println("Loop count: " + loopCount);
        }
        return false;
    }
}