package com.algorithms.dynamic_programming;

public class Fibonacci {
    public static int fibonacci(int fib_term) {
        // Using a bottom-up tabulation method
        if(fib_term <= 1) return fib_term;
        int[] fib_table = new int[fib_term + 1];
        fib_table[0] = 0; fib_table[1] = 1;
        for(int i = 2; i <= fib_term; ++i) {
            fib_table[i] = fib_table[i - 2] + fib_table[i - 1];
        }
        return fib_table[fib_term];
    }

    public static void main(String[] args) {
        int fib_term = 10;
        int result = fibonacci(fib_term);
        System.out.println(result);
    }
}
