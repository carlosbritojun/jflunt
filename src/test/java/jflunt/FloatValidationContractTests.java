package jflunt;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.Test;

import jflunt.validations.Contract;

public class FloatValidationContractTests {
    
    @Test
    public void isGreaterThanBigDouble() {
        
        var v1 = 5F;
        var v2 = 10F;

        var wrong = new Contract()
            .requires()
            .isGreaterThan(v1, v2, "float", "V1 is not greater than v2")
            .isGreaterThan(v1, 5F, "float", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isGreaterThan(v2, v1, "float", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterThanBigDecimal() {

        var v1 = new BigDecimal(5);
        var v2 = 10F;

        var wrong = new Contract()
            .requires()
            .isGreaterThan(v1, v2, "float", "V1 is not greater than v2")
            .isGreaterThan(v1, 5F, "float", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        v1 = new BigDecimal(10);
        v2 = 5F;

        var right = new Contract()
            .requires()
            .isGreaterThan(v1, v2, "float", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterThanFloat() {

        var v1 = 5F;
        var v2 = 10F;

        var wrong = new Contract()
            .requires()
            .isGreaterThan(v1, v2, "float", "V1 is not greater than v2")
            .isGreaterThan(v1, 5F, "float", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        v1 = 10F;
        v2 = 5F;

        var right = new Contract()
            .requires()
            .isGreaterThan(v1, v2, "float", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterThanInteger() {

        var v1 = 5;
        var v2 = 10F;

        var wrong = new Contract()
            .requires()
            .isGreaterThan(v1, v2, "float", "V1 is not greater than v2")
            .isGreaterThan(v1, 5, "float", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isGreaterThan(v2, v1, "float", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterThanLong() {

        var v1 = 5L;
        var v2 = 10F;

        var wrong = new Contract()
            .requires()
            .isGreaterThan(v1, v2, "float", "V1 is not greater than v2")
            .isGreaterThan(v1, 5, "float", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isGreaterThan(v2, v1, "float", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterOrEqualsThanFloat() {
        
        var v1 = 2F;
        var v2 = 5F;

        var wrong = new Contract()
            .requires()
            .isGreaterOrEqualsThan(v1, v2, "float", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isGreaterOrEqualsThan(v1, new BigDecimal(1), "float", "V1 is not greater than v2")
            .isGreaterOrEqualsThan(v1, new BigDecimal(2), "float", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThanBigDecimal() {

        var v1 = new BigDecimal(10);
        var v2 = 5F;

        var wrong = new Contract()
            .requires()
            .isLowerThan(v1, v2, "float", "V1 is not lower than v2")
            .isLowerThan(v1, new BigDecimal(5), "float", "V1 is not lower than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isLowerThan(v2, v1, "float", "V1 is not lower than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThanDouble() {

        var v1 = 10D;
        var v2 = 5F;

        var wrong = new Contract()
            .requires()
            .isLowerThan(v1, v2, "float", "V1 is not lower than v2")
            .isLowerThan(v1, new BigDecimal(5), "float", "V1 is not lower than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isLowerThan(v2, v1, "float", "V1 is not lower than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThanFloat() {

        var v1 = 10F;
        var v2 = 5F;

        var wrong = new Contract()
            .requires()
            .isLowerThan(v1, v2, "float", "V1 is not lower than v2")
            .isLowerThan(v1, new BigDecimal(5), "float", "V1 is not lower than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isLowerThan(v2, v1, "float", "V1 is not lower than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThanInteger() {

        var v1 = 10;
        var v2 = 5F;

        var wrong = new Contract()
            .requires()
            .isLowerThan(v1, v2, "float", "V1 is not lower than v2")
            .isLowerThan(v1, new BigDecimal(5), "float", "V1 is not lower than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isLowerThan(v2, v1, "float", "V1 is not lower than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThanLong() {

        var v1 = 10L;
        var v2 = 5F;

        var wrong = new Contract()
            .requires()
            .isLowerThan(v1, v2, "float", "V1 is not lower than v2")
            .isLowerThan(v1, new BigDecimal(5), "float", "V1 is not lower than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isLowerThan(v2, v1, "float", "V1 is not lower than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isBetween() {

        var val = -1.01F;
        var from = 1.01F;
        var to = 10F;

        var wrong = new Contract()
            .requires()
            .isBetween(val, from, to, "float", "The value -1.01 must be between 1.01 and 10");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        val = 1.015F;
        from = 1.01F;
        to = 1.02F;

        var right = new Contract()
            .requires()
            .isBetween(val, from, to, "float", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isNullOrOptional() {

        Optional<Float> floatOptional = Optional.ofNullable(null);

        var wrongOptional = new Contract()
            .requires()
            .isNullOrOptional(floatOptional, "float", "The BigDecimal is required");

        assertEquals(false, wrongOptional.isValid());
        assertEquals(1, wrongOptional.getNotifications().size());

        Optional<Float> floatNull = null;
        
        var wrongNull = new Contract()
            .requires()
            .isNullOrOptional(floatNull, "float", "The BigDecimal is required");

        assertEquals(false, wrongNull.isValid());

        Optional<Float> floatRight = Optional.of(10F);
        
        var right = new Contract()
            .requires()
            .isNullOrOptional(floatRight, "float", "The BigDecimal is required");

        assertEquals(true, right.isValid());
    }
}