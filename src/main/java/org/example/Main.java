package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }
        System.out.println(Arrays.toString(numbers));
//        int[] test = {37, 56, 10, 68, 21, 3, 81, 56, 64, 11};
        MergeSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
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

//    int[] test = {1,4,3,2 };
//    int[] testTwo = {1,4,3,2 };
//    int[] sorted = InsertionSortNew.sort(test);
//    int[] sortedTwo = InsertionSort.sort(testTwo);
//        System.out.println("Final result: " + Arrays.toString(sorted));
//                System.out.println("Final result: " + Arrays.toString(sortedTwo));