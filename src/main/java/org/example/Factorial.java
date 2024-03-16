package org.example;

public class Factorial {
    public static int getFactorialRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n * getFactorialRecursive(n - 1);
    }

    public static int getFactorialIterative(int n) {
        int i = 1;
        while (n > 0) {
            i *= n;
            n--;
        }
        return i;
    }
}