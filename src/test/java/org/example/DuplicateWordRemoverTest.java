package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateWordRemoverTest {

    @Test
    @DisplayName("Removes duplicate words")

    void removesDuplicateWords() {
        String result = DuplicateWordRemover.removeDuplicates("apple orange orange banana");
        assertEquals("apple orange banana", result);
    }

}