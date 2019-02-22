package jflunt.validations;

import java.math.BigDecimal;

public interface BigDecimalValidationContract extends ExtensibleContract {

    default public Contract isGreaterThan(BigDecimal val, BigDecimal comparer, String property, String message) {
        if (val.compareTo(comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(Double val, BigDecimal comparer, String property, String message) {
        if (new BigDecimal(val).compareTo(comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(Float val, BigDecimal comparer, String property, String message) {
        if (new BigDecimal(val).compareTo(comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(Integer val, BigDecimal comparer, String property, String message) {
        if (new BigDecimal(val).compareTo(comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(Long val, BigDecimal comparer, String property, String message) {
        if (new BigDecimal(val).compareTo(comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(BigDecimal val, BigDecimal comparer, String property, String message) {
        if (val.compareTo(comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Double val, BigDecimal comparer, String property, String message) {
        if (new BigDecimal(val).compareTo(comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Float val, BigDecimal comparer, String property, String message) {
        if (new BigDecimal(val).compareTo(comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Integer val, BigDecimal comparer, String property, String message) {
        if (new BigDecimal(val).compareTo(comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Long val, BigDecimal comparer, String property, String message) {
        if (new BigDecimal(val).compareTo(comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(BigDecimal val, BigDecimal comparer, String property, String message) {
        if (val.compareTo(comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Double val, BigDecimal comparer, String property, String message) {
        if (new BigDecimal(val).compareTo(comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Float val, BigDecimal comparer, String property, String message) {
        if (new BigDecimal(val).compareTo(comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Integer val, BigDecimal comparer, String property, String message) {
        if (new BigDecimal(val).compareTo(comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Long val, BigDecimal comparer, String property, String message) {
        if (new BigDecimal(val).compareTo(comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(BigDecimal val, BigDecimal comparer, String property, String message) {
        if (val.compareTo(comparer) > 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Double val, BigDecimal comparer, String property, String message) {
        if (new BigDecimal(val).compareTo(comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Float val, BigDecimal comparer, String property, String message) {
        if (new BigDecimal(val).compareTo(comparer) > 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Integer val, BigDecimal comparer, String property, String message) {
        if (new BigDecimal(val).compareTo(comparer) > 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Long val, BigDecimal comparer, String property, String message) {
        if (new BigDecimal(val).compareTo(comparer) > 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(BigDecimal val, BigDecimal comparer, String property, String message) {
        if (val.compareTo(comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Double val, BigDecimal comparer, String property, String message) {
        if (new BigDecimal(val).compareTo(comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Float val, BigDecimal comparer, String property, String message) {
        if (new BigDecimal(val).compareTo(comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Integer val, BigDecimal comparer, String property, String message) {
        if (new BigDecimal(val).compareTo(comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Long val, BigDecimal comparer, String property, String message) {
        if (new BigDecimal(val).compareTo(comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isBetween(BigDecimal val, BigDecimal from, BigDecimal to, String property, String message) {
        if (!(val.compareTo(from) >= 0 && val.compareTo(to) <= 0))
            getContract().addNotification(property, message);

        return getContract();
    }
}