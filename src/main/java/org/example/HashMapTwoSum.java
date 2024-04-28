package org.example;

import java.util.HashMap;

public class HashMapTwoSum {

    public static int[] getTwoSum(int[] input, int targetSum) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            int remainder = targetSum - input[i];
            if (hashMap.containsKey(remainder)) {
                return new int[]{hashMap.get(remainder), i};
            } else {
                hashMap.put(input[i], i);
            }
        }

        return new int[]{-1, -1};
    }
}


//HashMap<Integer, Integer> hashMap = new HashMap<>();
//// value is 1
//// remainder is 2
//// push key of 2 into hashmap
//// next time value is 2
//// remainder is 1
//// push key of
//        for (int i = 0; i < inputArray.length; i++) {
//int value = inputArray[i];
//            if (hashMap.containsKey(value)) {
//int[] resultArray = {i, hashMap.get(value)};
//                return resultArray;
//            }
//int remainder = targetSum - value;
//            hashMap.put(remainder, i);
////            if (hashMap.containsKey(remainder)) {
////                int[] resultArray = {i, hashMap.get(remainder)};
////                return resultArray;
////            }
//
//        }