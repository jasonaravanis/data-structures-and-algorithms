package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashMapTwoSumTest {

    @Test
    @DisplayName("Finds first two numbers to make sum")
    void findsSum() {
        int[] input = {1,2,3,4,5};
        int target = 3;
        int[] result = HashMapTwoSum.getTwoSum(input, target);
        assertArrayEquals(result, new int[]{0, 1});

    }

    @Test
    @DisplayName("Returns [-1, -1] if no sum possible")
    void findsNoSum() {
        int[] input = {1,2,3,4,5};
        int target = 12;
        int[] result = HashMapTwoSum.getTwoSum(input, target);
        assertArrayEquals(result, new int[]{-1, -1});
    }

}