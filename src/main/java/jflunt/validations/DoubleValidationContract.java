package jflunt.validations;

import java.math.BigDecimal;

public interface DoubleValidationContract extends ExtensibleContract {

    default public Contract isGreaterThan(Double val, Double comparer, String property, String message) {
        if (Double.compare(val, comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(Float val, Double comparer, String property, String message) {
        if (Double.compare(val, comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(Integer val, Double comparer, String property, String message) {
        if (Double.compare(val, comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(Long val, Double comparer, String property, String message) {
        if (Double.compare(val, comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(BigDecimal val, Double comparer, String property, String message) {
        if (val.compareTo(new BigDecimal(comparer)) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Double val, Double comparer, String property, String message) {
        if (Double.compare(val, comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Float val, Double comparer, String property, String message) {
        if (Double.compare(val, comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Integer val, Double comparer, String property, String message) {
        if (Double.compare(val, comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Long val, Double comparer, String property, String message) {
        if (Double.compare(val, comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(BigDecimal val, Double comparer, String property, String message) {
        if (val.compareTo(new BigDecimal(comparer)) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Double val, Double comparer, String property, String message) {
        if (Double.compare(val, comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Float val, Double comparer, String property, String message) {
        if (Double.compare(val, comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Integer val, Double comparer, String property, String message) {
        if (Double.compare(val, comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Long val, Double comparer, String property, String message) {
        if (Double.compare(val, comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(BigDecimal val, Double comparer, String property, String message) {
        if (val.compareTo(new BigDecimal(comparer)) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Double val, Double comparer, String property, String message) {
        if (Double.compare(val, comparer) > 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Float val, Double comparer, String property, String message) {
        if (Double.compare(val, comparer) > 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Integer val, Double comparer, String property, String message) {
        if (Double.compare(val, comparer) > 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Long val, Double comparer, String property, String message) {
        if (Double.compare(val, comparer) > 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(BigDecimal val, Double comparer, String property, String message) {
        if (val.compareTo(new BigDecimal(comparer)) > 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Double val, Double comparer, String property, String message) {
        if (Double.compare(val, comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Float val, Double comparer, String property, String message) {
        if (Double.compare(val, comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Integer val, Double comparer, String property, String message) {
        if (Double.compare(val, comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Long val, Double comparer, String property, String message) {
        if (Double.compare(val, comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(BigDecimal val, Double comparer, String property, String message) {
        if (val.compareTo(new BigDecimal(comparer)) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isBetween(Double val, Double from, Double to, String property, String message) {
        if (!(Double.compare(val, from) >= 0 && Double.compare(val, to) <= 0))
            getContract().addNotification(property, message);

        return getContract();
    }
}