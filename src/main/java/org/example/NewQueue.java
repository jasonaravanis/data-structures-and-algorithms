package org.example;

public class NewQueue<T> {
    // Making Queue again to refresh memory.
    // In real life use an ArrayDeque for a queue data structure

    private class Node<T> {
        private T value;

        private Node<T> next;

        private Node<T> prev;

        public Node(T data) {
            this.next = null;
            this.prev = null;
            this.value = data;
        }

    }

    private Node<T> head = null;
    private Node<T> tail = null;

    public boolean isEmpty() {
        if (head == null && tail == null) {
            return true;
        }
        return false;
    }

    public void addFirst(T data) {
        if (this.isEmpty()) {
            head = new Node(data);
            tail = head;
            return;
        }
        Node<T> newNode = new Node(data);
        Node<T> oldHead = head;
        head = newNode;
        newNode.next = oldHead;
        oldHead.prev = head;
    }

    public void addLast(T data) {
        if (this.isEmpty()) {
            head = new Node(data);
            tail = head;
            return;
        }
        Node<T> newNode = new Node(data);
        Node<T> oldTail = tail;
        tail = newNode;
        newNode.prev = oldTail;
        oldTail.next = tail;
    }




}
