package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class MinStack {

    LinkedList<Integer> main = new LinkedList<>();
    LinkedList<Integer> min = new LinkedList<>();

    public void push(int value) {

        Integer minFirst = min.peekFirst();
        Integer minLast = min.peekLast();

        if (main.size() == 0) {
            min.push(value);
        } else if (value < minFirst) {
            min.push(value);
        }
        else {
            min.push(minFirst);
        }
        main.push(value);
    }

    public int pop() {
        this.min.pop();
        return this.main.pop();
    }

    public int getMin() {
        return this.min.peekFirst();
    }

}
