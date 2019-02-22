package jflunt;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import jflunt.validations.Contract;

public class StringValidationContractTests {

    @Test
    public void isNotNullOrEmpty() {

        var wrong = new Contract()
            .requires()
            .isNotNullOrEmpty(null, "string", "String is null")
            .isNotNullOrEmpty("", "string", "String is empty");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isNotNullOrEmpty("Some valid string", "string", "String is null");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isNullOrEmpty() {

        var right = new Contract()
            .requires()
            .isNullOrEmpty(null, "string", "String is Null")
            .isNullOrEmpty("", "string", "String is Empty");

        assertEquals(true, right.isValid());
        assertEquals(0, right.getNotifications().size());

        var wrong = new Contract()
            .requires()
            .isNullOrEmpty("Some valid string", "string", "String is Null");

        assertEquals(false, wrong.isValid());
    }

    @Test
    public void hasMinLen() {

        var wrong  = new Contract()
            .requires()
            .hasMinLen("null", 5,  "string", "String len is less than permited");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .hasMinLen("Some Valid String", 5, "string", "String len is less than permited");

        assertEquals(true, right.isValid());
    }

    @Test
    public void hasMaxLen() {

        var wrong  = new Contract()
            .requires()
            .hasMaxLen("null", 3, "string", "String len is more than permited");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .hasMinLen("Some1", 5, "string", "String len is less than permited");

        assertEquals(true, right.isValid());
    }

    @Test
    public void hasLen() {

        var wrong  = new Contract()
            .requires()
            .hasLen("null", 3, "string", "String len is more than permited");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .hasLen("Some1", 5, "string", "String len is less than permited");

        assertEquals(true, right.isValid());
    }

    @Test
    public void contains() {

        var wrong  = new Contract()
            .requires()
            .contains("some text here", "banana", "string", "String does not contains banana");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .contains("some banana here", "banana", "string", "String does not contains banana");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isEmail() {

        var wrong  = new Contract()
            .requires()
            .isEmail("wrongemail", "string", "Invalid E-mail");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isEmail("carlosbritojun@gmail.com", "string", "Invalid E-mail");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isUrl() {

        var wrong  = new Contract()
            .requires()
            .isUrl("wrongurl", "string", "Invalid URL");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isUrl("https://gmail.com", "string", "Invalid URL")
            .isUrl("http://gmail.com", "string", "Invalid URL")
            .isUrl("http://balta.io/", "string", "Invalid URL");

        assertEquals(true, right.isValid());
    }
}
