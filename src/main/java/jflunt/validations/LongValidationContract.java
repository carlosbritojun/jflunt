package jflunt.validations;

import java.math.BigDecimal;

public interface LongValidationContract extends ExtensibleContract {

    default public Contract isGreaterThan(Long val, Long comparer, String property, String message) {
        if (Long.compare(val, comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(Integer val, Long comparer, String property, String message) {
        if (Long.compare(val, comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(Double val, Long comparer, String property, String message) {
        if (Double.compare(val, comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(Float val, Long comparer, String property, String message) {
        if (Float.compare(val, comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(BigDecimal val, Long comparer, String property, String message) {
        if (val.compareTo(new BigDecimal(comparer)) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Long val, Long comparer, String property, String message) {
        if (Long.compare(val, comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Integer val, Long comparer, String property, String message) {
        if (Long.compare(val, comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Float val, Long comparer, String property, String message) {
        if (Float.compare(val, comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Double val, Long comparer, String property, String message) {
        if (Double.compare(val, comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(BigDecimal val, Long comparer, String property, String message) {
        if (val.compareTo(new BigDecimal(comparer)) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Long val, Long comparer, String property, String message) {
        if (Long.compare(val, comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Integer val, Long comparer, String property, String message) {
        if (Long.compare(val, comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Float val, Long comparer, String property, String message) {
        if (Float.compare(val, comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Double val, Long comparer, String property, String message) {
        if (Double.compare(val, comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(BigDecimal val, Long comparer, String property, String message) {
        if (val.compareTo(new BigDecimal(comparer)) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Long val, Long comparer, String property, String message) {
        if (Long.compare(val, comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Integer val, Long comparer, String property, String message) {
        if (Long.compare(val, comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Double val, Long comparer, String property, String message) {
        if (Double.compare(val, comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Float val, Long comparer, String property, String message) {
        if (Float.compare(val, comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(BigDecimal val, Long comparer, String property, String message) {
        if (val.compareTo(new BigDecimal(comparer)) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Long val, Long comparer, String property, String message) {
        if (Long.compare(val, comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Integer val, Long comparer, String property, String message) {
        if (Long.compare(val, comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Double val, Long comparer, String property, String message) {
        if (Double.compare(val, comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Float val, Long comparer, String property, String message) {
        if (Float.compare(val, comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(BigDecimal val, Long comparer, String property, String message) {
        if (val.compareTo(new BigDecimal(comparer)) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isBetween(Long val, Long from, Integer to, String property, String message) {
        if (!(Long.compare(val, from) >= 0 && Long.compare(val, to) <= 0))
            getContract().addNotification(property, message);

        return getContract();
    }
}