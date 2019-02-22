package jflunt.validations;

import java.math.BigDecimal;

public interface FloatValidationContract extends ExtensibleContract {

    default public Contract isGreaterThan(Float val, Float comparer, String property, String message) {
        if (Float.compare(val, comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(Double val, Float comparer, String property, String message) {
        if (Double.compare(val, comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(Integer val, Float comparer, String property, String message) {
        if (Float.compare(val, comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(Long val, Float comparer, String property, String message) {
        if (Float.compare(val, comparer) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterThan(BigDecimal val, Float comparer, String property, String message) {
        if (val.compareTo(new BigDecimal(comparer)) <= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Float val, Float comparer, String property, String message) {
        if (Float.compare(val, comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Double val, Float comparer, String property, String message) {
        if (Double.compare(val, comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Integer val, Float comparer, String property, String message) {
        if (Float.compare(val, comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(Long val, Float comparer, String property, String message) {
        if (Float.compare(val, comparer) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isGreaterOrEqualsThan(BigDecimal val, Float comparer, String property, String message) {
        if (val.compareTo(new BigDecimal(comparer)) < 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Float val, Float comparer, String property, String message) {
        if (Float.compare(val, comparer) > 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Double val, Float comparer, String property, String message) {
        if (Double.compare(val, comparer) > 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Integer val, Float comparer, String property, String message) {
        if (Float.compare(val, comparer) > 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(Long val, Float comparer, String property, String message) {
        if (Float.compare(val, comparer) > 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerThan(BigDecimal val, Float comparer, String property, String message) {
        if (val.compareTo(new BigDecimal(comparer)) > 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Float val, Float comparer, String property, String message) {
        if (Float.compare(val, comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Double val, Float comparer, String property, String message) {
        if (Double.compare(val, comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Integer val, Float comparer, String property, String message) {
        if (Float.compare(val, comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(Long val, Float comparer, String property, String message) {
        if (Float.compare(val, comparer) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isLowerOrEqualsThan(BigDecimal val, Float comparer, String property, String message) {
        if (val.compareTo(new BigDecimal(comparer)) >= 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Float val, Float comparer, String property, String message) {
        if (Float.compare(val, comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Double val, Float comparer, String property, String message) {
        if (Double.compare(val, comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Integer val, Float comparer, String property, String message) {
        if (Float.compare(val, comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(Long val, Float comparer, String property, String message) {
        if (Float.compare(val, comparer) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract areEquals(BigDecimal val, Float comparer, String property, String message) {
        if (val.compareTo(new BigDecimal(comparer)) == 0)
            getContract().addNotification(property, message);

        return getContract();
    }

    default public Contract isBetween(Float val, Float from, Float to, String property, String message) {
        if (!(Float.compare(val, from) >= 0 && Float.compare(val, to) <= 0))
            getContract().addNotification(property, message);

        return getContract();
    }
}