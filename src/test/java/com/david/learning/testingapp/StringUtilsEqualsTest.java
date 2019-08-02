package com.david.learning.testingapp;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StringUtilsEqualsTest {

    private String validate = "ASDF";
    private String expected = "FDSA";

    @Test
    public void validateEquality() {
        assertEquals(expected, StringUtils.reverse(validate));
    }

    @Test
    public void validateEqualityMessage() {
        assertEquals(expected, StringUtils.reverse(validate), "Error in equality");
    }

    @Test
    public void validateEqualitySupplier() {
        Supplier<String> message = () -> "Supplier Error";
        assertEquals(expected, StringUtils.reverse(validate), message);
    }

    @Test
    public void validateNotEquality() {
        assertNotEquals(validate, StringUtils.reverse(expected));
    }

    @Test
    public void validateNotEqualitySupplier() {
        assertNotEquals(StringUtils.reverse(validate), StringUtils.reverse(expected), () -> "Supplier Not Equality");
    }

}
