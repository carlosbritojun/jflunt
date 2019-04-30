package jflunt;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.Test;

import jflunt.validations.Contract;

public class IntegerValidationContractTests {
    
    @Test
    public void isGreaterThanInteger() {

        int v1 = 5;
        int v2 = 10;

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
    public void isGreaterThanLong() {

        long v1 = 5L;
        int v2 = 10;

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
        int v2 = 10;

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
        int v2 = 10;

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
        int v2 = 10;

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
        int v2 = 5;

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
        int v2 = 5;

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
        int v2 = 5;

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
        int v2 = 5;

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
        int v2 = 5;

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

        Optional<Integer> intOptional = Optional.ofNullable(null);

        Contract wrongOptional = new Contract()
            .requires()
            .isNullOrOptional(intOptional, "float", "The BigDecimal is required");

        assertEquals(false, wrongOptional.isValid());
        assertEquals(1, wrongOptional.getNotifications().size());

        Optional<Integer> intNull = null;
        
        Contract wrongNull = new Contract()
            .requires()
            .isNullOrOptional(intNull, "float", "The BigDecimal is required");

        assertEquals(false, wrongNull.isValid());

        Optional<Integer> intRight = Optional.of(10);
        
        Contract right = new Contract()
            .requires()
            .isNullOrOptional(intRight, "float", "The BigDecimal is required");

        assertEquals(true, right.isValid());
    }
}