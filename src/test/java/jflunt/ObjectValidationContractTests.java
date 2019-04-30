package jflunt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jflunt.validations.Contract;

public class ObjectValidationContractTests {

    @Test
    public void isNull() {

        Object obj = 10;
        String message = "Object is not null";

        Contract contract = new Contract()
            .requires()
            .isNull(obj, "object", message);

        assertTrue(contract.isInvalid());
        assertEquals(1, contract.getNotifications().size());
        assertEquals(message, contract.getNotifications().get(0).getMessage());
    }

    @Test
    public void isNotNull() {

        Object obj = null;
        String message = "Object is null";

        Contract contract = new Contract()
            .requires()
            .isNotNull(obj, "object", message);

        assertTrue(contract.isInvalid());
        assertEquals(1, contract.getNotifications().size());
        assertEquals(message, contract.getNotifications().get(0).getMessage());
    }

    @Test
    public void areEqual() {

        Object obj = 10;
        Object obj1 = 20;
        String message = "Object is not equal";

        Contract worng = new Contract()
            .requires()
            .areEquals(obj, obj1, "object", message);

        assertTrue(worng.isInvalid());
        assertEquals(1, worng.getNotifications().size());
        assertEquals(message, worng.getNotifications().get(0).getMessage());

        obj = 10;
        obj1 = "sample string";

        Contract right = new Contract()
            .requires()
            .areEquals(obj, obj1, "object", message);

        assertTrue(right.isInvalid());
        assertEquals(1, right.getNotifications().size());
        assertEquals(message, right.getNotifications().get(0).getMessage());
    }

    @Test
    public void areNotEqual() {

        Object obj = 10;
        Object obj1 = 10;
        String message = "Object is equal";

        Contract contract = new Contract()
            .requires()
            .areNotEquals(obj, obj1, "object", message);

        assertTrue(contract.isInvalid());
        assertEquals(1, contract.getNotifications().size());
        assertEquals(message, contract.getNotifications().get(0).getMessage());
    }
}