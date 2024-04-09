package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxStackTest {

    @Test
    @DisplayName("Gets maximum of 5,32,24")
    void testOne() {
        MaxStack stack = new MaxStack();
        stack.push(5);
        stack.push(32);
        stack.push(24);
        assertEquals(32, stack.getMax());
    }

    @Test
    @DisplayName("Gets maximum of 1,0,0")
    void testTwo() {
        MaxStack stack = new MaxStack();
        stack.push(1);
        stack.push(0);
        stack.push(0);
        assertEquals(1, stack.getMax());
    }

    @Test
    @DisplayName("handles empty stack")
    void testThree() {
        MaxStack stack = new MaxStack();
        assertNull(stack.getMax());
    }
}