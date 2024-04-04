package org.example;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinStackTest {

    @Test
    @DisplayName("Finds minimum when first element")
    void findMinStart() {
        MinStack ms = new MinStack();
        ms.push(1);
        ms.push(2);
        ms.push(3);
        assertEquals(ms.getMin(), 1);
    }

    @Test
    @DisplayName("Finds minimum when middle element")
    void findMinMiddle() {
        MinStack ms = new MinStack();
        ms.push(2);
        ms.push(1);
        ms.push(3);
        assertEquals(ms.getMin(), 1);
    }

    @Test
    @DisplayName("Finds minimum when last element")
    void findMinEnd() {
        MinStack ms = new MinStack();
        ms.push(2);
        ms.push(3);
        ms.push(1);
        assertEquals(ms.getMin(), 1);
    }
}
