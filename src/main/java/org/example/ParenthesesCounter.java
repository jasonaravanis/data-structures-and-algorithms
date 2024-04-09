package org.example;

import java.util.LinkedList;
import java.util.stream.IntStream;

public class ParenthesesCounter {





    public static boolean checkParentheses(String input) {
        LinkedList<Character> stack = new LinkedList<>();
        IntStream chars = input.chars();

        chars.forEach(character -> {
            if (character == '(') {
                stack.addFirst((char) character);
            } else if (character == ')') {
                stack.removeFirst();
            }
        });

        return stack.isEmpty();
    }
}
