package com.david.learning.testingapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class FailTest {

    @Test
    public void methodNotImplementedYet() {
        fail();
    }

    @Test
    public void methodValidateExceptionThrown() {
        try {
            this.throwsExceptionMethod();
            fail("Exception was not throwed");
        } catch (Exception e) {
            fail(e);
        }
    }

    public void throwsExceptionMethod() {
        throw new UnsupportedOperationException();
    }


}
