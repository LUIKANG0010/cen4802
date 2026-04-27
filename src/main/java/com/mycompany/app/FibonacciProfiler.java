//Robert Williams

package com.mycompany.app;

public class FibonacciProfiler {
    public static long fib(int n) {
        if (n <= 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting the profiling workload...");

        for (int i = 1; i <= 5; i++) {
            long startTime = System.currentTimeMillis();

            long result = fib(45);

            long endTime = System.currentTimeMillis();

            System.out.println("Run " + i + ": fib(45) = " + result +
                    " completed in " + (endTime - startTime) + " ms");
        }

        System.out.println("The program will stay open for VisualVM profiling...");
        Thread.sleep(180000);
    }
}
