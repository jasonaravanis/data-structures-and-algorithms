package org.example;

import java.util.Optional;

public class Queue<T> {
    // A basic queue. In real life just use an ArrayDeque which implements the Deque abstract interface

    private static class Node<T> {
        private T value;
        private Node<T> next;
        private Node<T> previous;

        public Node(T data) {
            this.value = data;
            this.next = null;
            this.previous = null;
        }
    }
    private Node<T> head = null;
    private Node<T> tail = null;

    private int size = 0;

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(T data) {
        try {
            Node<T> newNode = new Node<>(data);
            if (this.isEmpty()) {
                this.head = newNode;
                this.tail = this.head;
                return;
            }
            newNode.previous = tail;
            this.tail.next = newNode;
            this.tail = newNode;
        } finally {
            this.size++;
        }

    }

    public Optional<T> dequeue() {
        if (this.isEmpty()) {
            return null;
        }

        Node<T> popNode = this.head;
        this.size--;
        if (this.isEmpty()) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
            this.head.previous = null;
        }
        return Optional.ofNullable(popNode.value);
    }

    public Optional<T> peek() {
        if (this.isEmpty()) {
            return null;
        }
        return Optional.ofNullable(this.head.value);
    }
}
