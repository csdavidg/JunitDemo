package com.david.learning.testingapp;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class AssertTimeoutPreemptivelyTest {

    @Test
    void timeoutExceededWithPreemptiveTermination() {
        assertTimeoutPreemptively(Duration.ofMillis(10), () -> {
            Thread.sleep(100);
            System.out.println("Tarea Finalizada");
        });
    }

}
