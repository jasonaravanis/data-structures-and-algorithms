package org.example;

public class InsertionSortNew {

    public static int[] sort(int[] array) {
        // we loop over each element, starting with the second element as the pivot
        // we assume the list on the left side of the pivot is sorted (if it just has one element in it at
        // position 0, it is sorted)
        // we examine the element at the end of the left list.
        // if the value is greater than the pivot value, we move it one spot to the right (into the pivot value position)
        // we repeat as long as there are elements to process (i > 0) and the value of the most recent element is still
        // greater than the pivot value

        int whileLoopCount = 0;

        for (int i = 1; i < array.length; i++) {
            int pivot = array[i];
            int j = i - 1;
            while (j > 0 && array[j] > pivot) {
                array[j + 1] = array[j];
                j--;
                whileLoopCount++;
            }
            array[j + 1] = pivot;
        }

        System.out.println("While loop count: " + whileLoopCount);
        return array;
    }
}