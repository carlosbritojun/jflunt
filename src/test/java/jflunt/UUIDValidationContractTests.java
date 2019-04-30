package jflunt;

import static org.junit.Assert.assertEquals;

import java.util.UUID;

import org.junit.Test;

import jflunt.validations.Contract;

public class UUIDValidationContractTests {

    @Test
    public void areEquals() {

        UUID uuid = UUID.randomUUID();

        Contract wrong = new Contract()
            .requires()
            .areEquals(uuid, UUID.randomUUID(), "uuid", "UUID is not equal");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        Contract right = new Contract()
            .requires()
            .areEquals(uuid, uuid, "uuid", "UUID's are equals");

        assertEquals(true, right.isValid());
    }

    @Test
    public void areNotEquals() {

        UUID uuid = UUID.randomUUID();

        Contract wrong = new Contract()
            .requires()
            .areNotEquals(uuid, uuid, "uuid", "UUID's are equals");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        Contract right = new Contract()
            .requires()
            .areNotEquals(uuid, UUID.randomUUID(), "uuid", "UUID's are not equals");

        assertEquals(true, right.isValid());
    }
}