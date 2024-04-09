package org.example;

import java.util.LinkedList;

public class MaxStack {

    // A stack that keeps track of all values, and the largest value added to the stack

    LinkedList<Integer> mainList = new LinkedList<>();
    LinkedList<Integer> maxList = new LinkedList<>();

    public void push(int value) {
        mainList.push(value);
        if (maxList.isEmpty()) {
            maxList.push(value);
            return;
        }
        if (maxList.peekFirst() >= value) {
            maxList.push(maxList.peekFirst());
            return;
        }
        if (maxList.peekFirst() < value) {
            maxList.push(value);
        }
    }

    public Integer getMax() {
        return maxList.peekFirst();
    }
}
