package jflunt;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import jflunt.validations.Contract;

public class BooleanValidationContractTests {
    @Test
    public void isTrue() {
        Contract wrong = new Contract().requires().isTrue(false, "boolean", "Boolean is false");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        Contract right = new Contract().requires().isTrue(true, "boolean", "Boolean is false");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isFalse() {

        Contract wrong = new Contract().requires().isFalse(true, "boolean", "Boolean is true");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        Contract right = new Contract().requires().isFalse(false, "boolean", "Boolean is true");

        assertEquals(true, right.isValid());
    }
}
