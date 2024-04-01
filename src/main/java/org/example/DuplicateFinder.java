package org.example;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateFinder {

    public static String[] getDuplicates(String[] array) {

        ArrayList<String> duplicates = new ArrayList<>();
        HashSet<String> set = new HashSet<>();

        for (String item : array) {
            int setCount = set.size();
            set.add(item);
            int newSetCount = set.size();

            if (newSetCount == setCount) {
                duplicates.add(item);
            }
        }

        return duplicates.toArray(new String[0]);
    }
}
