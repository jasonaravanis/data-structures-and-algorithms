package org.example;

public class ZeroSorter {

    // Find all 0's in an array and move them to the end

    public static int[] sort(int[] array) {

        int zeroIndex = 0;

        for (int index = 0; index < array.length; index++) {
            int n = array[index];
                if (n != 0) {
                    array[zeroIndex] = n;
                    if (zeroIndex != index) {
                        array[index] = 0;
                    }
                    zeroIndex++;

                }
        }
        return array;
    }

}
