//Robert Williams

package com.mycompany.app;

public class Fibonacci {

    /**
     * Returns the nth term of the Fibonacci sequence using recursion.
     *
     * @param n the term index (must be >= 0)
     * @return the nth Fibonacci number
     * @throws IllegalArgumentException if n is negative
     */
    public static long fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        long result = fib(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}