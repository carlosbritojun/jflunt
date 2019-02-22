package jflunt.validations;

import java.math.BigDecimal;

public interface IntegerValidationContract extends ExtensibleContract {

    default public Contract isGreaterThan(Integer val, Integer comparer, String property, String message) {
        if (Integer.compare(val, comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(Long val, Integer comparer, String property, String message) {
        if (Long.compare(val, comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(Double val, Integer comparer, String property, String message) {
        if (Double.compare(val, comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(Float val, Integer comparer, String property, String message) {
        if (Float.compare(val, comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(BigDecimal val, Integer comparer, String property, String message) {
        if (val.compareTo(new BigDecimal(comparer)) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Integer val, Integer comparer, String property, String message) {
        if (Integer.compare(val, comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Long val, Integer comparer, String property, String message) {
        if (Long.compare(val, comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Float val, Integer comparer, String property, String message) {
        if (Float.compare(val, comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Double val, Integer comparer, String property, String message) {
        if (Double.compare(val, comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(BigDecimal val, Integer comparer, String property, String message) {
        if (val.compareTo(new BigDecimal(comparer)) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Integer val, Integer comparer, String property, String message) {
        if (Integer.compare(val, comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Long val, Integer comparer, String property, String message) {
        if (Long.compare(val, comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Float val, Integer comparer, String property, String message) {
        if (Float.compare(val, comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Double val, Integer comparer, String property, String message) {
        if (Double.compare(val, comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(BigDecimal val, Integer comparer, String property, String message) {
        if (val.compareTo(new BigDecimal(comparer)) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Integer val, Integer comparer, String property, String message) {
        if (Integer.compare(val, comparer) > 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Long val, Integer comparer, String property, String message) {
        if (Long.compare(val, comparer) > 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Double val, Integer comparer, String property, String message) {
        if (Double.compare(val, comparer) > 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Float val, Integer comparer, String property, String message) {
        if (Float.compare(val, comparer) > 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(BigDecimal val, Integer comparer, String property, String message) {
        if (val.compareTo(new BigDecimal(comparer)) > 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Integer val, Integer comparer, String property, String message) {
        if (Integer.compare(val, comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Long val, Integer comparer, String property, String message) {
        if (Long.compare(val, comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Double val, Integer comparer, String property, String message) {
        if (Double.compare(val, comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Float val, Integer comparer, String property, String message) {
        if (Float.compare(val, comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(BigDecimal val, Integer comparer, String property, String message) {
        if (val.compareTo(new BigDecimal(comparer)) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isBetween(Integer val, Integer from, Integer to, String property, String message) {
        if (!(Integer.compare(val, from) >= 0 && Integer.compare(val, to) <= 0))
            getContract().addNotification(property, message);

        return getContract();
    }
}