package jflunt;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.Test;

import jflunt.validations.Contract;

public class LongValidationContractTests {
    
    @Test
    public void isGreaterThanInteger() {

        int v1 = 5;
        long v2 = 10L;

        Contract wrong = new Contract()
            .requires()
            .isGreaterThan(v1, v2, "integer", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        Contract right = new Contract()
            .requires()
            .isGreaterThan(v2, v1, "integer", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterThanBigDouble() {
        
        double v1 = 5D;
        long v2 = 10L;

        Contract wrong = new Contract()
            .requires()
            .isGreaterThan(v1, v2, "integer", "V1 is not greater than v2")
            .isGreaterThan(v1, 5, "integer", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        Contract right = new Contract()
            .requires()
            .isGreaterThan(v2, v1, "integer", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterThanBigDecimal() {

        BigDecimal v1 = new BigDecimal(5);
        long v2 = 10L;

        Contract wrong = new Contract()
            .requires()
            .isGreaterThan(v1, v2, "integer", "V1 is not greater than v2")
            .isGreaterThan(v1, 5, "integer", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        v1 = new BigDecimal(10);
        v2 = 5;

        Contract right = new Contract()
            .requires()
            .isGreaterThan(v1, v2, "integer", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterThanFloat() {

        float v1 = 5F;
        long v2 = 10L;

        Contract wrong = new Contract()
            .requires()
            .isGreaterThan(v1, v2, "integer", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        v1 = 10F;
        v2 = 5;

        Contract right = new Contract()
            .requires()
            .isGreaterThan(v1, v2, "integer", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterOrEqualsThanInteger() {
        
        float v1 = 2F;
        long v2 = 5L;

        Contract wrong = new Contract()
            .requires()
            .isGreaterOrEqualsThan(v1, v2, "integer", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        Contract right = new Contract()
            .requires()
            .isGreaterOrEqualsThan(v1, new BigDecimal(1), "integer", "V1 is not greater than v2")
            .isGreaterOrEqualsThan(v1, new BigDecimal(2), "integer", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThanBigDecimal() {

        BigDecimal v1 = new BigDecimal(10);
        long v2 = 5L;

        Contract wrong = new Contract()
            .requires()
            .isLowerThan(v1, v2, "integer", "V1 is not lower than v2")
            .isLowerThan(v1, new BigDecimal(5), "integer", "V1 is not lower than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        Contract right = new Contract()
            .requires()
            .isLowerThan(v2, v1, "integer", "V1 is not lower than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThanDouble() {

        double v1 = 10D;
        long v2 = 5L;

        Contract wrong = new Contract()
            .requires()
            .isLowerThan(v1, v2, "integer", "V1 is not lower than v2")
            .isLowerThan(v1, new BigDecimal(5), "integer", "V1 is not lower than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        Contract right = new Contract()
            .requires()
            .isLowerThan(v2, v1, "integer", "V1 is not lower than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThanFloat() {

        float v1 = 10F;
        long v2 = 5L;

        Contract wrong = new Contract()
            .requires()
            .isLowerThan(v1, v2, "integer", "V1 is not lower than v2")
            .isLowerThan(v1, new BigDecimal(5), "integer", "V1 is not lower than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        Contract right = new Contract()
            .requires()
            .isLowerThan(v2, v1, "integer", "V1 is not lower than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThanInteger() {

        int v1 = 10;
        long v2 = 5L;

        Contract wrong = new Contract()
            .requires()
            .isLowerThan(v1, v2, "integer", "V1 is not lower than v2")
            .isLowerThan(v1, new BigDecimal(5), "integer", "V1 is not lower than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        Contract right = new Contract()
            .requires()
            .isLowerThan(v2, v1, "integer", "V1 is not lower than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isBetween() {

        int val = 20;
        int from = 11;
        int to = 10;

        Contract wrong = new Contract()
            .requires()
            .isBetween(val, from, to, "integer", "The value 20 must be between 11 and 12");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        val = 11;
        from = 10;
        to = 12;

        Contract right = new Contract()
            .requires()
            .isBetween(val, from, to, "integer", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isNullOrOptional() {

        Optional<Long> longOptional = Optional.ofNullable(null);

        Contract wrongOptional = new Contract()
            .requires()
            .isNullOrOptional(longOptional, "float", "The BigDecimal is required");

        assertEquals(false, wrongOptional.isValid());
        assertEquals(1, wrongOptional.getNotifications().size());

        Optional<Long> longNull = null;
        
        Contract wrongNull = new Contract()
            .requires()
            .isNullOrOptional(longNull, "float", "The BigDecimal is required");

        assertEquals(false, wrongNull.isValid());

        Optional<Long> longRight = Optional.of(10L);
        
        Contract right = new Contract()
            .requires()
            .isNullOrOptional(longRight, "float", "The BigDecimal is required");

        assertEquals(true, right.isValid());
    }
}