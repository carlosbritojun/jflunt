package jflunt;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.Test;

import jflunt.validations.Contract;

public class DoubleValidationContractTests {

    @Test
    public void isGreaterThanBigDouble() {

        double v1 = 5D;
        double v2 = 10D;

        Contract wrong = new Contract().requires().isGreaterThan(v1, v2, "double", "V1 is not greater than v2")
                .isGreaterThan(v1, 5D, "double", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        Contract right = new Contract().requires().isGreaterThan(v2, v1, "double", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterThanBigDecimal() {

        BigDecimal v1 = new BigDecimal(5);
        double v2 = 10D;

        Contract wrong = new Contract().requires().isGreaterThan(v1, v2, "double", "V1 is not greater than v2")
                .isGreaterThan(v1, 5D, "double", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        v1 = new BigDecimal(10);
        v2 = 5D;

        Contract right = new Contract().requires().isGreaterThan(v1, v2, "double", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterThanFloat() {

        float v1 = 5F;
        double v2 = 10D;

        Contract wrong = new Contract().requires().isGreaterThan(v1, v2, "double", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        v1 = 10F;
        v2 = 5D;

        Contract right = new Contract().requires().isGreaterThan(v1, v2, "double", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterThanInteger() {

        int v1 = 5;
        double v2 = 10D;

        Contract wrong = new Contract().requires().isGreaterThan(v1, v2, "double", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        Contract right = new Contract().requires().isGreaterThan(v2, v1, "double", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterThanLong() {

        long v1 = 5L;
        double v2 = 10D;

        Contract wrong = new Contract().requires().isGreaterThan(v1, v2, "double", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        Contract right = new Contract().requires().isGreaterThan(v2, v1, "double", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isGreaterOrEqualsThanDouble() {

        double v1 = 2D;
        double v2 = 5D;

        Contract wrong = new Contract().requires().isGreaterOrEqualsThan(v1, v2, "double", "V1 is not greater than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        Contract right = new Contract().requires()
                .isGreaterOrEqualsThan(v1, new BigDecimal(1), "bigDecimal", "V1 is not greater than v2")
                .isGreaterOrEqualsThan(v1, new BigDecimal(2), "bigDecimal", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThanBigDecimal() {

        BigDecimal v1 = new BigDecimal(10);
        double v2 = 5D;

        Contract wrong = new Contract().requires().isLowerThan(v1, v2, "double", "V1 is not lower than v2")
                .isLowerThan(v1, new BigDecimal(5), "double", "V1 is not lower than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        Contract right = new Contract().requires().isLowerThan(v2, v1, "double", "V1 is not lower than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThanDouble() {

        double v1 = 10D;
        double v2 = 5D;

        Contract wrong = new Contract().requires().isLowerThan(v1, v2, "double", "V1 is not lower than v2")
                .isLowerThan(v1, new BigDecimal(5), "double", "V1 is not lower than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        Contract right = new Contract().requires().isLowerThan(v2, v1, "double", "V1 is not lower than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThanFloat() {

        float v1 = 10F;
        double v2 = 5D;

        Contract wrong = new Contract().requires().isLowerThan(v1, v2, "double", "V1 is not lower than v2")
                .isLowerThan(v1, new BigDecimal(5), "double", "V1 is not lower than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        Contract right = new Contract().requires().isLowerThan(v2, v1, "double", "V1 is not lower than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThanInteger() {

        int v1 = 10;
        double v2 = 5D;

        Contract wrong = new Contract().requires().isLowerThan(v1, v2, "double", "V1 is not lower than v2")
                .isLowerThan(v1, new BigDecimal(5), "double", "V1 is not lower than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        Contract right = new Contract().requires().isLowerThan(v2, v1, "double", "V1 is not lower than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isLowerThanLong() {

        long v1 = 10L;
        double v2 = 5D;

        Contract wrong = new Contract().requires().isLowerThan(v1, v2, "double", "V1 is not lower than v2")
                .isLowerThan(v1, new BigDecimal(5), "double", "V1 is not lower than v2");

        assertEquals(false, wrong.isValid());
        assertEquals(2, wrong.getNotifications().size());

        Contract right = new Contract().requires().isLowerThan(v2, v1, "double", "V1 is not lower than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isBetween() {

        double val = -1.01D;
        double from = 1.01D;
        double to = 10D;

        Contract wrong = new Contract().requires().isBetween(val, from, to, "double",
                "The value -1.01 must be between 1.01 and 10");

        assertEquals(false, wrong.isValid());
        assertEquals(1, wrong.getNotifications().size());

        val = 1.015D;
        from = 1.01D;
        to = 1.02D;

        Contract right = new Contract()
            .requires()
            .isBetween(val, from, to, "double", "V1 is not greater than v2");

        assertEquals(true, right.isValid());
    }

    @Test
    public void isNullOrOptional() {

        Optional<Double> doubleOptional = Optional.ofNullable(null);

        Contract wrongOptional = new Contract()
            .requires()
            .isNullOrOptional(doubleOptional, "double", "The BigDecimal is required");

        assertEquals(false, wrongOptional.isValid());
        assertEquals(1, wrongOptional.getNotifications().size());

        Optional<Double> doubleNull = null;
        
        Contract wrongNull = new Contract()
            .requires()
            .isNullOrOptional(doubleNull, "double", "The BigDecimal is required");

        assertEquals(false, wrongNull.isValid());

        Optional<Double> doubleRight = Optional.of(10D);
        
        Contract right = new Contract()
            .requires()
            .isNullOrOptional(doubleRight, "double", "The BigDecimal is required");

        assertEquals(true, right.isValid());
    }
}