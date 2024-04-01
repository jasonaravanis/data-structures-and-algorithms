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
}