package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] test = {2,4,6 };
        int[] sorted = InsertionSort.sort(test);
        System.out.println("Final result: " + Arrays.toString(sorted));
    }
}



//        int needle = 11;
//        int[] haystack = {1,2,3,4,5,6,7,8,9,10,11};
//        boolean result = BinarySearchNew.binarySearchRecursive(haystack,needle);
//        boolean result = Search.binarySearchRecursive(haystack, needle);
//        int result = FactorialNew.getFactorialRecursive(5);

//        String needle = "paris";
//        String[] haystack = {"adelaide", "adelaide", "amsterdam", "beijing", "berlin", "brisbane", "chicago", "darwin", "detroit", "melbourne", "new york", "paris", "perth", "sydney", "toronto", "vancouver", "zanzibar"};
//        Boolean result = BinarySearch.binarySearch(haystack, "adelaide");

//        System.out.println(result);

//        System.out.println(Arrays.binarySearch(haystack, 5));
//        System.out.println(Arrays.binarySearch(haystack, "adelaide"));