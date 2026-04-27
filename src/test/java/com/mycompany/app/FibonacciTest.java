//Robert Williams

package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    public void testFib10() {
        assertEquals(55, Fibonacci.fib(10));
    }

    @Test
    public void testFib0() {
        assertEquals(0, Fibonacci.fib(0));
    }
}