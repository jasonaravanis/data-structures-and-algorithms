package org.example;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        MinStack minStack = new MinStack();

        minStack.push(0);
        minStack.push(2);

        minStack.push(3);
        minStack.push(1);




        System.out.println(minStack.getMin());

    }
}

