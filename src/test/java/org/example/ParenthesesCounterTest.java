package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesesCounterTest {

    @Test
    @DisplayName(" '()()()' is balanced")
    void testOne() {
        boolean result = ParenthesesCounter.checkParentheses("()()()");
        assertTrue(result);
    }

    @Test
    @DisplayName(" '()()(' is not balanced")
    void testTwo() {
        boolean result = ParenthesesCounter.checkParentheses("()()(");
        assertFalse(result);
    }

    @Test
    @DisplayName(" '((()))' is balanced")
    void testThree() {
        boolean result = ParenthesesCounter.checkParentheses("((()))");
        assertTrue(result);
    }
}