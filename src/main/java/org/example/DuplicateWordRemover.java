package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateWordRemover {

    public static String removeDuplicates(String input) {
        HashMap<String, String> hashMap = new HashMap<>();
        ArrayList<String> outWords = new ArrayList<>();
        String[] words = input.split(" ");
        for (String word : words) {
            if (hashMap.containsKey(word)) {
                continue;
            }
            hashMap.put(word, word);
            outWords.add(word);
        }
        return String.join(" ", outWords);
    }
}
