package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arr = {9,3,7,4,69,420,42};
        QuickSort.sort(arr);
        System.out.println(Arrays.toString(arr));
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

//    int[] test = {1,2,3,4,5};
//        System.out.println(BinarySearchNew.search(test, 6));

//    Random rand = new Random();
//    int[] numbers = new int[10];
//        for (int i = 0; i < numbers.length; i++) {
//        numbers[i] = rand.nextInt(100);
//        }
//        System.out.println(Arrays.toString(numbers));
//        InsertionSortNew.sort(numbers);
//        System.out.println(Arrays.toString(numbers));