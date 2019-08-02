package com.david.learning.testingapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertThrowTest {

    @Test
    public void testAssertThrows() {
        assertThrows(ArithmeticException.class, () -> divide(1, 0));
    }

    @Test
    public void testAssertThrowsSupplier() {
        assertThrows(ArithmeticException.class, () -> divide(1, 0), () -> "Dividing by 0 is an error");
    }

    private int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
