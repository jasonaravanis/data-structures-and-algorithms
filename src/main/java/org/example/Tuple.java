package org.example;

public class Tuple {

    public static void runExample() {
        Object[] tuple = new Object[2];

        tuple[0] = "hello";
        tuple[1] = 42;

        String firstElement = (String) tuple[0];
        int secondElement = (int) tuple[1];

        System.out.println("First element: " + firstElement);
        System.out.println("Second element: " + secondElement);

        // need to cast the Object to be an int, and then cast the int to be a char
        char secondElementAsChar = (char) ((int) tuple[1]);
        System.out.println("Second element as char: " + secondElementAsChar);
    }
}
