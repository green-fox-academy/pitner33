package e05Fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void testFibonacci0() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    void testFibonacci1() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    void testFibonacciN() {
        assertEquals(55, Fibonacci.fibonacci(10));
    }

    @Test
    void testFibonacciNegative() {
        assertEquals(0, Fibonacci.fibonacci(-1));
    }
}