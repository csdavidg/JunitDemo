package com.david.learning.testingapp;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsAssertTest {


    @Test
    public void givenNullString_whenReverseIsCalled_thenNullIsReturned() {
        String actual = StringUtils.reverse((null));
        String message = "Actual String should not be null !!! ";
        assertNull(actual, message);
    }

    @Test
    public void givenNullString_whenReverseIsCalled_thenNullIsReturned2() {
        String actual = StringUtils.reverse((null));
        Supplier<String> messageSupplier = () -> "Actual String should not be null !!! ";
        assertNull(actual, messageSupplier);
    }

    @Test
    public void givenEmptyString_whenReverseIsCalled_thenEmptyStringIsReturned() {
        String actual = StringUtils.reverse((""));
        assertNotNull(actual);
    }

    @Test
    public void givenNonNullString_whenReverseIsCalled_thenReversedStringIsReturned() {
        String actual = StringUtils.reverse(("ABCD"));
        assertNotNull(actual);
    }

    @Test
    public void validateAsserSame() {
        Person person1 = new Person("Cristian", "Sanchez");
        //Person person2 = new Person("Cristian", "Sanchez");
        Person person2 = person1;
        assertSame(person1, person2);
    }

    @Test
    public void validateAssertEquals() {
        Person person1 = new Person("Cristian", "Sanchez");
        //Person person2 = new Person("Cristian", "Sanchez");
        Person person2 = person1;
        assertEquals(person1, person2);
    }

    @Test
    public void validateArrayEquality() {
        int[] intList = {1, 2, 3};
        int[] intList2 = {1, 2, 3, 4};
        assertArrayEquals(intList, intList2);
    }

    @Test
    public void validateIterableEquals() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> integers1 = Arrays.asList(1, 2, 3, 4, 5);
        assertIterableEquals(integers, integers1);
    }

}
