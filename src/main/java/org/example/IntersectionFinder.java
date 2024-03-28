package org.example;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionFinder {

    public static String[] getIntersection(String[] arrayOne, String[] arrayTwo) {
        HashSet<String> setOne = new HashSet<>(Arrays.asList(arrayOne));
        HashSet<String> setTwo = new HashSet<>(Arrays.asList(arrayTwo));

        HashSet<String> intersection = new HashSet<>(setOne);

        intersection.retainAll(setTwo);

        return intersection.toArray(new String[intersection.size()]);
    }
}
