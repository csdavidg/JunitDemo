package com.david.learning.testingapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class AssumptionsTest {


    @Test
    public void validateAssumptionObjectWasInitialized() {
        //Person person = new Person("David", "Sanchez");
        Person person = null;
        assumeTrue(person != null,
                () -> "The Object can't be null, in the assert equals validation it should throw a NullPointerException");
        assertEquals(person.getName(), "David");
    }

    @Test
    public void validateAssumptionObjectWasNotInitialized() {
        //Person person = new Person("David", "Sanchez");
        Person person = null;
        assumeFalse(person != null, () -> "The expected value form this object is null");
        assertThrows(NullPointerException.class, () -> person.getLastName());
    }

}
