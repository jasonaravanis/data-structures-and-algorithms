package org.example;

import java.util.LinkedList;

public class Stack<T> {

    LinkedList<T> list = new LinkedList<T>();

    public void push(T data) {
        list.addLast(data);
    }

    public T pop() {
        return list.removeLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

}
