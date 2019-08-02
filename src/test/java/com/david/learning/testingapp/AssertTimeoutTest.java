package com.david.learning.testingapp;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class AssertTimeoutTest {

    @Test
    public void timeoutNotExceeded() {
        assertTimeout(Duration.ofMinutes(3), () -> 2 * 2);
    }

    @Test
    public void timeoutNotExceededWithResult() {
        String actualResult = assertTimeout(Duration.ofMinutes(3), () -> "result");
        assertEquals("result", actualResult);
    }

    @Test
    public void timeoutNotExceededWithMethod() {
        String actualGreeting = assertTimeout(Duration.ofMinutes(3), AssertTimeoutTest::greeting);
        assertEquals("Hello, World!", actualGreeting);
    }

    @Test
    public void timeoutExceeded() {
        assertTimeout(Duration.ofMillis(10), () -> {
            Thread.sleep(20L);
            System.out.println("Tarea Finalizada");
        });
    }

    private static String greeting() {
        return "Hello, World!";
    }
}
