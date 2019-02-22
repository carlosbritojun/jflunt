package jflunt;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.Test;

import jflunt.validations.Contract;

public class BigDecimalValidationContractTests {
    
    @Test
    public void isGreaterThanBigDecimal() {
        
        var v1 = new BigDecimal(5);
        var v2 = new BigDecimal(10);

        var wrong = new Contract()
            .requires()
            .isGreaterThan(v1, v2, "bigDecimal", "V1 is not greater than v2")
            .isGreaterThan(v1, new BigDecimal(5), "bigDecimal", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isGreaterThan(v2, v1, "bigDecimal", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterThanDouble() {

        double v1 = 5;
        var v2 = new BigDecimal(10);

        var wrong = new Contract()
            .requires()
            .isGreaterThan(v1, v2, "bigDecimal", "V1 is not greater than v2")
            .isGreaterThan(v1, new BigDecimal(5), "bigDecimal", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        v1 = 10;
        v2 = new BigDecimal(5);

        var right = new Contract()
            .requires()
            .isGreaterThan(v1, v2, "bigDecimal", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterThanFloat() {

        var v1 = 5F;
        var v2 = new BigDecimal(10);

        var wrong = new Contract()
            .requires()
            .isGreaterThan(v1, v2, "bigDecimal", "V1 is not greater than v2")
            .isGreaterThan(v1, new BigDecimal(5), "bigDecimal",  "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        v1 = 10;
        v2 = new BigDecimal(5);

        var right = new Contract()
            .requires()
            .isGreaterThan(v1, v2, "bigDecimal", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterThanInteger() {

        int v1 = 5;
        var v2 = new BigDecimal(10);

        var wrong = new Contract()
            .requires()
            .isGreaterThan(v1, v2, "bigDecimal", "V1 is not greater than v2")
            .isGreaterThan(v1, new BigDecimal(5), "bigDecimal", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isGreaterThan(v2, v1, "bigDecimal", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterThanLong() {

        var v1 = 5L;
        var v2 = new BigDecimal(10);

        var wrong = new Contract()
            .requires()
            .isGreaterThan(v1, v2, "bigDecimal", "V1 is not greater than v2")
            .isGreaterThan(v1, new BigDecimal(5), "bigDecimal", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isGreaterThan(v2, v1, "bigDecimal", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterOrEqualsThanBigDecimal() {
        
        var v1 = new BigDecimal(2);
        var v2 = new BigDecimal(5);

        var wrong = new Contract()
            .requires()
            .isGreaterOrEqualsThan(v1, v2, "bigDecimal", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isGreaterOrEqualsThan(v1, new BigDecimal(1), "bigDecimal", "V1 is not greater than v2")
            .isGreaterOrEqualsThan(v1, new BigDecimal(2), "bigDecimal", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThanBigDecimal() {

        int v1 = 10;
        var v2 = new BigDecimal(5);

        var wrong = new Contract()
            .requires()
            .isLowerThan(v1, v2, "bigDecimal", "V1 is not lower than v2")
            .isLowerThan(v1, new BigDecimal(5), "bigDecimal", "V1 is not lower than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isLowerThan(v2, v1, "bigDecimal", "V1 is not lower than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThanDouble() {

        var v1 = 10D;
        var v2 = new BigDecimal(5);

        var wrong = new Contract()
            .requires()
            .isLowerThan(v1, v2, "bigDecimal", "V1 is not lower than v2")
            .isLowerThan(v1, new BigDecimal(5), "bigDecimal", "V1 is not lower than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isLowerThan(v2, v1, "bigDecimal", "V1 is not lower than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThanFloat() {

        var v1 = 10F;
        var v2 = new BigDecimal(5);

        var wrong = new Contract()
            .requires()
            .isLowerThan(v1, v2, "bigDecimal", "V1 is not lower than v2")
            .isLowerThan(v1, new BigDecimal(5), "bigDecimal", "V1 is not lower than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isLowerThan(v2, v1, "bigDecimal", "V1 is not lower than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThanInteger() {

        var v1 = 10;
        var v2 = new BigDecimal(5);

        var wrong = new Contract()
            .requires()
            .isLowerThan(v1, v2, "bigDecimal", "V1 is not lower than v2")
            .isLowerThan(v1, new BigDecimal(5), "bigDecimal", "V1 is not lower than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isLowerThan(v2, v1, "bigDecimal", "V1 is not lower than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThanLong() {

        var v1 = 10L;
        var v2 = new BigDecimal(5);

        var wrong = new Contract()
            .requires()
            .isLowerThan(v1, v2, "bigDecimal", "V1 is not lower than v2")
            .isLowerThan(v1, new BigDecimal(5), "bigDecimal", "V1 is not lower than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        var right = new Contract()
            .requires()
            .isLowerThan(v2, v1, "bigDecimal", "V1 is not lower than v2");

        assertEquals(true, right.isValid());
    }


    @Test
    public void isBetween() {

        var val = new BigDecimal(-1.01);
        var from = new BigDecimal(1.01);
        var to = new BigDecimal(10);

        var wrong = new Contract()
            .requires()
            .isBetween(val, from, to, "bigDecimal", "The value -1.01 must be between 1.01 and 10");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        val = new BigDecimal(1.015);
        from = new BigDecimal(1.01);
        to = new BigDecimal(1.02);

        var right = new Contract()
            .requires()
            .isBetween(val, from, to, "bigDecimal", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isNullOrOptional() {

        Optional<BigDecimal> bigDecimalOptional = Optional.ofNullable(null);

        var wrongOptional = new Contract()
            .requires()
            .isNullOrOptional(bigDecimalOptional, "bigDecimal", "The BigDecimal is required");

        assertEquals(false, wrongOptional.isValid());
        assertEquals(1, wrongOptional.getNotifications().size());

        Optional<BigDecimal> bigDecimalNull = null;
        
        var wrongNull = new Contract()
            .requires()
            .isNullOrOptional(bigDecimalNull, "bigDecimal", "The BigDecimal is required");

        assertEquals(false, wrongNull.isValid());

        Optional<BigDecimal> bigDecimalRight = Optional.of(new BigDecimal(10));
        
        var right = new Contract()
            .requires()
            .isNullOrOptional(bigDecimalRight, "bigDecimal", "The BigDecimal is required");

        assertEquals(true, right.isValid());
    }
}