package org.example;

public class LinkedList<T> {

    private Node<T> head;

    private static class Node<T> {
        private T data;
        private Node<T> next;
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public boolean find(T data) {
        Node<T> current = this.head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public T remove(T data) {
        Node<T> current = this.head;
        if (current.data == data) {
            Node<T> target = head;
            this.head = this.head.next;
            return target.data;

        }
        while (current.next != null) {
            if (current.next.data == data) {
                Node<T> removalTarget = current.next;
                current.next = removalTarget.next;
                return removalTarget.data;
            }
            current = current.next;
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            stringBuilder.append(current.data);
            if (current.next != null) {
                stringBuilder.append(" --> ");
            }
            current = current.next;
        }
        return stringBuilder.toString();
    }

    public void reverse() {
        Node<T> current = head;
        Node<T> previous = null;

        while (current != null) {
            Node<T> next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        this.head = previous;
    }
}