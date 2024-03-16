package org.example;

public class FactorialNew {

    public static int getFactorial(int n) {
        int factorial = 1;
        while (n > 0) {
            factorial *= n;
            n--;
        }
        return factorial;
    }

    public static int getFactorialRecursive(int n) {
        if (n == 1) {
            return n;
        }
        return n * getFactorialRecursive(n - 1);
    }
}