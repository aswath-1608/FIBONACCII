package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FibonacciTest {
    @Test
    void testSeries() {
        Fibonacci app = new Fibonacci();
        assertEquals("0 1 1 2 3 5 8", app.series(7));
    }
}
