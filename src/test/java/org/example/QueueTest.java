package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    @DisplayName("Enqueues")
    void testOne() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        assertEquals(queue.peek().get(), 10);
    }

    @Test
    @DisplayName("Dequeues")
    void testTwo() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals(queue.dequeue().get(), 10);
        assertEquals(queue.dequeue().get(), 20);

    }

}