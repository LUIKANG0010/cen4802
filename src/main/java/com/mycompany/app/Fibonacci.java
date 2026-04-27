//Robert Williams

package com.mycompany.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fibonacci {

    private static final Logger logger = LoggerFactory.getLogger(Fibonacci.class);

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

        logger.info("Starting the Fibonacci application");
        logger.info("Calculating the Fibonacci number for n = {}", n);

        long result = fib(n);

        logger.info("The Fibonacci calculation was completed successfully");
        logger.info("Result for n = {} is {}", n, result);

        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}